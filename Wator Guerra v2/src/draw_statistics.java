import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class draw_statistics extends JPanel{

	Statistics_kachel[] sk = new Statistics_kachel[750];

	String Fische;
	String Haie;
	String Wale;

	Color Fisch = new Color(5,221,245);
	Color Hai = new Color(33,14,140);
	Color Wal = new Color(245,34,189);


	draw_statistics(Statistics_kachel[] stat) {
		
		super();
		sk = stat;
		Fische=" ";
		Haie=" ";
		Wale=" ";


	}

	public void uebergeben(Statistics_kachel[] stat,int fische, int haie, int wale) {
		sk = stat;
		Fische=String.valueOf(fische);
		Haie=String.valueOf(haie);
		Wale=String.valueOf(wale);
	}

	protected void paintComponent(final Graphics g) {
		super.paintComponent(g);
	//	System.out.println("PAINTED");
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 3.5F);
		g.setFont(newFont);
		g.setColor(Fisch);		
		g.drawString("Fische: " + Fische, 1100 , 40);
		g.setColor(Hai);
		g.drawString("Haie: " + Haie, 1100 , 80);
		g.setColor(Wal);
		g.drawString("Wale: " + Wale, 1100 , 120);
		for(int i=0; i<750;i++){
			g.setColor(Fisch);			
			g.fillRect(sk[i].getX(),sk[i].getYfisch(),3, 3);
			g.setColor(Hai);
			g.fillRect(sk[i].getX(),sk[i].getYHai(), 3, 3);
			g.setColor(Wal);
			g.fillRect(sk[i].getX(),sk[i].getYWal(), 3, 3);
		
		}
	}
}