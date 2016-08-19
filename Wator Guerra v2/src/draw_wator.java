import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

	public class draw_wator extends JPanel {
		public static Kachel[] kacheln = new Kachel[150000];

		draw_wator(Kachel[] k) {
			super();
			kacheln = k;

		}

		public void uebergeben(Kachel[] k) {
			kacheln = k;
		}

		protected void paintComponent(final Graphics g) {
			super.paintComponent(g);
			Dimension size = getSize();
			for (int i = 0; i <= 149999; i++) {
				g.setColor(kacheln[i].getColor());
				g.fillRect(kacheln[i].getX(), kacheln[i].getY(), 2, 2);
			}
		}
	}