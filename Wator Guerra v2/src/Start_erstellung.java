import java.awt.Color;


public class Start_erstellung {

	Kachel[] kacheln = new Kachel[150000];
	
	public Start_erstellung(Kachel[] ukacheln) {
		// TODO Auto-generated constructor stub
		kacheln = ukacheln;
		create();
		verknuepfe();
	}
	
	public void create(){
		int x=0;
		int y=0;
		for(int i = 0; i<=149999; i++){
			if((i%500==0)&&(i>499)){
				y+=3;
				x=0;
			}
			kacheln[i] = new Kachel();
			kacheln[i].setX(x);
			kacheln[i].setY(y);
			kacheln[i].setColor(Color.BLACK);
			x+=3;    			
			}
	}
	public void verknuepfe(){		
		//ECKEN
	 kacheln[0].setOB(kacheln[149500]);
		kacheln[0].setRE(kacheln[1]);
		kacheln[0].setLI(kacheln[499]);
		kacheln[0].setUN(kacheln[500]);
		kacheln[499].setOB(kacheln[149999]);
		kacheln[499].setRE(kacheln[149500]);
		kacheln[499].setLI(kacheln[498]);
		kacheln[499].setUN(kacheln[999]); 
		kacheln[149500].setOB(kacheln[149000]);
		kacheln[149500].setRE(kacheln[149500]);
		kacheln[149500].setLI(kacheln[149499]);
		kacheln[149500].setUN(kacheln[0]);
		kacheln[149999].setOB(kacheln[149499]);
		kacheln[149999].setRE(kacheln[149500]);
		kacheln[149999].setLI(kacheln[149998]);
		kacheln[149999].setUN(kacheln[499]);		
		//MITTE
		for(int i=501;i<=149498;i++){
			kacheln[i].setOB(kacheln[i-500]);
			kacheln[i].setRE(kacheln[i+1]);
			kacheln[i].setLI(kacheln[i-1]);
			kacheln[i].setUN(kacheln[i+500]);	
		}

		//OBEN
		for(int i=1;i<=498;i++){
			kacheln[i].setOB(kacheln[i+149500]);
			kacheln[i].setRE(kacheln[i+1]);
			kacheln[i].setLI(kacheln[i-1]);
			kacheln[i].setUN(kacheln[i+500]);
		}
		//LINKS
		for(int i=500;i<=149000;i+=500){
			kacheln[i].setOB(kacheln[i-500]);
			kacheln[i].setRE(kacheln[i+1]);
			kacheln[i].setLI(kacheln[i+499]);
			kacheln[i].setUN(kacheln[i+500]);
		}
		//RECHTS
		for(int i=999;i<=149499;i+=500){
			kacheln[i].setOB(kacheln[i-500]);
			kacheln[i].setRE(kacheln[i-499]);
			kacheln[i].setLI(kacheln[i-1]);
			kacheln[i].setUN(kacheln[i+500]);    			
		}
		//UNTEN
		for(int i=149501;i<=149998;i++){
			kacheln[i].setOB(kacheln[i-500]);
			kacheln[i].setRE(kacheln[i+1]);
			kacheln[i].setLI(kacheln[i-1]);
			kacheln[i].setUN(kacheln[i-149500]);    			
		}
	
	}
	
	public void haie(){
		for(int i=50000;i<=90000;i++){
			kacheln[i].F=true;
		}
	}
	public void fisch(){
		for(int i=85000;i<=100000;i++){
			kacheln[i].H=true;
		}
	}
	public void wal(){
		for(int i=0;i<=149999;i++){
			kacheln[i].W=true;
		}
	}
	
	public Kachel[] getKacheln(){
		return kacheln;
	}
}
