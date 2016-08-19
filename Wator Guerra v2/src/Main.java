import java.awt.Color;
import static java.awt.GraphicsDevice.WindowTranslucency.*;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Main extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	
	//Visualisierung
	public static Kachel[] Kacheln = new Kachel[150000];
	
	//Statistik
	public static Statistics_kachel[] StatsKacheln = new Statistics_kachel[750];
	
	//Thread
	static Thread MyThread;
	
	//Visualisierungsfenster
	static JFrame SimulationFrame;
	
	//Statistikfenster
	static JFrame StatisticsFrame;
	
	//Main-Objekt
	static Main Main;
	
	//Paint Objekt für die Visualisierung
	static draw_wator DrawWator;
	
	//Paint Objekt für dieStatistik
	static draw_statistics DrawStats;
	
	//Zum Pausieren und Weiterlaufen der Simulation
	static Object GUI_INITIALIZATION_MONITOR = new Object();
	static boolean pauseThreadFlag = false;
	
	static int Fischecount;
	static int Haiecount;
	static int Walecount;
	
	static int StartFisch;
	static int StartHai;
	static int StartWal;
	
	public static void main(String[] args) {
		
		//Eingabefenster
		
		//Durchsichtigkeit
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();	
            
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
        	System.err.println("Translucency is not supported"); //     System.exit(0);
            }
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Erstellen vom Eingabefenster
		Main = new Main();
		Main.setPreferredSize (new Dimension( 500, 500 ));
		Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main.pack();
		Main.setLocationRelativeTo(null);
		Main.setVisible(true);
		MyThread = new Thread(Main);
		Startmenu sm = new Startmenu();
		JButton starten = new JButton("START");	
		
		//Hinzufügen von ActionListener
		starten.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			
				//Start_erstellungsfunktion
				Start_erstellung se = new Start_erstellung(Kacheln);
				Kacheln = se.getKacheln();
				
				//Fisch_erstellenfunktion
				
				StartFisch=Integer.parseInt(sm.getFanzahl().getText());
				
				Fische_erstellen fi = new Fische_erstellen(
						Integer.parseInt(sm.getFanzahl().getText()),
						Kacheln,
						Integer.parseInt(sm.getFreproduktion().getText()));
				
				fi.start();
				Kacheln = fi.getKacheln();
				
				StartHai=Integer.parseInt(sm.getHanzahl().getText());
				
				//Haie_erstellenfunktion
				Haie_erstellen he = new Haie_erstellen(
						Integer.parseInt(sm.getHanzahl().getText()), 
						Kacheln,
						Integer.parseInt(sm.getHlebensenergie().getText()), 
						Integer.parseInt(sm.getTFhaifrisstfisch().getText()), 
						Integer.parseInt(sm.getTFhaireproduktion().getText()));
				
				he.start();
				Kacheln = he.getKacheln();
				
				StartWal=Integer.parseInt(sm.getTFWalanzahl().getText());
				
				//Wale_erstellenfunktion
				Wale_erstellen wa = new Wale_erstellen(
						Integer.parseInt(sm.getTFWalanzahl().getText()), 
						Kacheln, 
						Integer.parseInt(sm.getTFWalenergie().getText()),
						Integer.parseInt(sm.getTFwalfrisstfisch().getText()),
						Integer.parseInt(sm.getTFwalfrissthai().getText()), 
						Integer.parseInt(sm.getTFwalreproduktion().getText()));
				
				wa.start();
				Kacheln = wa.getKacheln();
				
				//X-Koordinate für die Statistik festlegen
				for(int i=0;i<750;i++){
					StatsKacheln[i]=new Statistics_kachel((i*2));
					
				} 		
				
				//Einstellunge für Simulationsfenster setzten 
				DrawWator = new draw_wator(Kacheln);
				SimulationFrame = new JFrame();
				SimulationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				SimulationFrame.setPreferredSize(new Dimension(1510, 930));
				SimulationFrame.add(DrawWator);
				SimulationFrame.pack();
				SimulationFrame.setLocationRelativeTo(null);
				SimulationFrame.setVisible(true);				
				StatisticsFrame = new JFrame();
				StatisticsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JButton starting = new JButton("Start");
				
				//ActionListener für "Start"
				starting.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						resumeThread();
					
					}
				});
				
				//ActionListener für "Stop"
				JButton stopping = new JButton("Stop");
				stopping.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							pauseThread();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				
				//Einstellunge für Statistikfenster setzten 
				DrawStats = new draw_statistics(StatsKacheln);
				DrawStats.add(stopping);
				DrawStats.add(starting);
				StatisticsFrame.setPreferredSize(new Dimension(1510, 240));
				StatisticsFrame.add(DrawStats);
				StatisticsFrame.pack();
				StatisticsFrame.setLocationRelativeTo(null);
				StatisticsFrame.setVisible(true);
						
				//DURCHSICHTIGKEIT
				StatisticsFrame.setOpacity(1f);
				
				//Thread starten!
				MyThread.start();
				try {
					takeScreenshot(00);
				} catch (AWTException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			
		});
		
		//Startbutton dem Startmenu übergeben (mit ActionListener)
		sm.buttonsetzten(starten);
		Main.add(sm);
		Main.pack();
		
	}

	//Farbesetzenfunktion
	public void setFarbe() {
		Color Fisch = new Color(5,221,245);
		Color Hai = new Color(33,14,140);
		Color Wal = new Color(245,34,189);
		Color Frei = new Color(238,238,238);
		
		for (int i = 0; i <= 149999; i++) {
			//Nur Fisch 
			if (Kacheln[i].isF() && !Kacheln[i].isW() && !Kacheln[i].isH()) {
				Kacheln[i].setColor(Fisch);
			}
			//Hai und kein Wal (Fisch egal)
			else if (!Kacheln[i].isW() && Kacheln[i].isH()) {
				Kacheln[i].setColor(Hai);
			}
			//Wal
			else if (Kacheln[i].isW()) {
				Kacheln[i].setColor(Wal);
			}
			//Leeres Feld
			else if (Kacheln[i].isempty()) {
				Kacheln[i].setColor(Frei);
			}

		}
	}

	//Sterbefunktion 
	public void sterben() {
	//	System.out.println("TOETEN HAENGT");

		Sterben st = new Sterben(Kacheln);
		st.kill();
		Kacheln = st.getKacheln();
	}
	
	//Fressfunktion
	public void fressen() {
	//	System.out.println("FRESSEN HAENGT");
		Fressen fress = new Fressen(Kacheln);
		fress.eat();
		Kacheln = fress.getKacheln();
		
	}
	
	//Geburtsfunktion
	public void geburt() {
//		System.out.println("GEBURT HAENGT");
		Geburt gb = new Geburt(Kacheln);
		gb.gebaehren();
		Kacheln = gb.getKacheln();
	
	}

	//Bewegfunktion
	public void bewegen() {
	//	System.out.println("BEWEGEN HAENGT");
		Bewegen bw = new Bewegen(Kacheln, 1, 1);
		bw.bewegen();
		Kacheln = bw.getKacheln();
	
	}
	
	public void EvoFisch() {
	//	System.out.println("BEWEGEN HAENGT");
		Fisch_Evo FischEvo = new Fisch_Evo(Kacheln);
		Kacheln = FischEvo.getKacheln();
	
	}
	
	public void EvoHai() {
	//	System.out.println("BEWEGEN HAENGT");
		Hai_Evo HaiEvo = new Hai_Evo(Kacheln);
		Kacheln = HaiEvo.getKacheln();
	
	}
	
	public void EvoWal() {
	//	System.out.println("BEWEGEN HAENGT");
		Wal_Evo WalEvo = new Wal_Evo(Kacheln);
		Kacheln = WalEvo.getKacheln();
	
	}
	
	public void EvoBackFisch() {
	//	System.out.println("BEWEGEN HAENGT");
		Fisch_Back_Evo FischEvoBack = new Fisch_Back_Evo(Kacheln);
		Kacheln = FischEvoBack.getKacheln();
	
	}
	
	public void EvoBackHai() {
	//	System.out.println("BEWEGEN HAENGT");
		Hai_Back_Evo HaiEvoBack = new Hai_Back_Evo(Kacheln);
		Kacheln = HaiEvoBack.getKacheln();
	
	}
	
	public void EvoBackWal() {
	//	System.out.println("BEWEGEN HAENGT");
		Wal_Back_Evo WalEvoBack = new Wal_Back_Evo(Kacheln);
		Kacheln = WalEvoBack.getKacheln();
	
	}
	//Aktuelle Statistik berechnen
	public Statistics_kachel zaehlen() {
		
		int wale = 0;
		int haie = 0;
		int fische =0;
		
		Statistics_kachel k = new Statistics_kachel();
		
		for (int i = 0; i < 150000; i++) {
			if (Kacheln[i].isF()) {
				fische++;
			}
			if (Kacheln[i].isH()) {
				haie++;
			}
			if (Kacheln[i].isW()) {
				wale++;
			}

		}
		Fischecount = fische;
		Haiecount = haie;
		Walecount = wale;
		k.setYfisch(fische);
		k.setYHai(haie);
		k.setYWal(wale);
		
		return k;
	}

	//Thread Anhalten
	public void stop() {
		if (MyThread != null) {
			MyThread.stop();
			MyThread = null;
		}
	}
	
	//Verschiebe letzte Statistik nach hinten
	public void ruecken(){
		for( int index =StatsKacheln.length-2; index >= 0 ; index-- ){
			int x = StatsKacheln[index+1].getX();
			StatsKacheln[index+1] = StatsKacheln[index];
            StatsKacheln[index].setX(index*2);
		}
		StatsKacheln[0]=zaehlen();
		StatsKacheln[0].setX(0);
	}

	public static void takeScreenshot(int name) throws AWTException, IOException{
		
        Robot robot = new Robot();
        String format = "png";
        String picture1 =  String.valueOf(name) + "." + format;
        Rectangle captureRect1 = new Rectangle(205,113, 1510, 930);
        BufferedImage screenFullImage = robot.createScreenCapture(captureRect1);
        ImageIO.write(screenFullImage, format, new File(picture1));		
	}
	
	//Thread läuft
	public void run() {
		
		Excel_Writer excel = new Excel_Writer();
		
		try {
			
			excel.init();
			excel.eintragen(0, 1, Integer.toString(StartFisch));
			excel.eintragen(1, 1, Integer.toString(StartHai));
			excel.eintragen(2, 1, Integer.toString(StartWal));
		} catch (WriteException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int zyklus=0;
		int zaehler=2;
		int evozaehler=0;
		
		while (true) {
			if(zyklus%100==0){
			/*	if(evozaehler==38){
					evozaehler=0;
				}*/
				if(evozaehler<=18){
				//	EvoFisch();
				//	EvoHai();
				//	EvoWal();
					evozaehler++;
					System.out.println("EVO");
				}
			/*	else if(evozaehler>=19){
				//	EvoBackFisch();
					EvoBackHai();
					EvoBackWal();
					System.out.println("RUECK-EVO");
					evozaehler++;


				}*/
			}

			
			
			if(zyklus%10==0){
				try {
					//takeScreenshot(zyklus);
					excel.eintragen(0, zaehler, Integer.toString(Fischecount));
					excel.eintragen(1, zaehler, Integer.toString(Haiecount));
					excel.eintragen(2, zaehler, Integer.toString(Walecount));
					System.out.println("ZYKLUS:" + zyklus);
					zaehler++;
				} catch (RowsExceededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(zyklus==4000){
				try {
					excel.fini();
				} catch (WriteException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sterben();
			fressen();
			geburt();
			checkForPaused();
			zaehlen();
			DrawStats.uebergeben(StatsKacheln, Fischecount, Haiecount, Walecount);
			DrawStats.repaint();
			ruecken();
			DrawWator.uebergeben(Kacheln);
			DrawWator.repaint();
			setFarbe();				
			bewegen();	
			zyklus++;
	
		}
	}
	
	//Auf Pause überprüfen
    private void checkForPaused() {
        synchronized (GUI_INITIALIZATION_MONITOR) {
            while (pauseThreadFlag) {
                try {
                    GUI_INITIALIZATION_MONITOR.wait();
                } catch (Exception e) {}
            }
        }
    }
    
    //Pause gesetzt
    public static void pauseThread() throws InterruptedException {
        pauseThreadFlag = true;
    }
    
    //Wiederaufnahme
    public static void resumeThread() {
        synchronized(GUI_INITIALIZATION_MONITOR) {
            pauseThreadFlag = false;
            GUI_INITIALIZATION_MONITOR.notify();
        }
    }
}