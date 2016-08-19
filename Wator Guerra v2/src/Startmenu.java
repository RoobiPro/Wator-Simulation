import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Startmenu extends JPanel{
	
	JTextField fanzahl;
	JTextField freproduktion;
	
	JTextField hanzahl;
	JTextField hlebensenergie;
	JTextField TFhaifrisstfisch;
	JTextField TFhaireproduktion;
	
	JTextField TFWalanzahl;
	JTextField TFWalenergie; 
	JTextField TFwalfrisstfisch;
	JTextField TFwalfrissthai;
	JTextField TFwalreproduktion;
	
	Startmenu(){	
		//FISCHE
		this.setLayout(new GridBagLayout());
		GridBagConstraints erstelinks = new GridBagConstraints();
		erstelinks.gridx=0;
		erstelinks.gridy=0;
		JLabel labelfische = new JLabel("Fische");
		labelfische.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(labelfische, erstelinks);
		
		GridBagConstraints erstemitte = new GridBagConstraints();
		erstemitte.gridx=1;
		erstemitte.gridy=0;
		fanzahl = new JTextField("50000");
		fanzahl.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(fanzahl, erstemitte);

		GridBagConstraints zweitemitte = new GridBagConstraints();
		zweitemitte.gridx=1;
		zweitemitte.gridy=1;
		freproduktion = new JTextField("20");
		freproduktion.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(freproduktion, zweitemitte);
		
		GridBagConstraints ersterechts = new GridBagConstraints();
		ersterechts.gridx=2;
		ersterechts.gridy=0;
		JLabel lfanzahl = new JLabel("Anzahl");
		lfanzahl.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(lfanzahl, ersterechts);
		
		GridBagConstraints zweiterechts = new GridBagConstraints();
		zweiterechts.gridx=2;
		zweiterechts.gridy=1;
		JLabel lfreproduktion = new JLabel("Reproduktionszeitpunkt");
		lfreproduktion.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(lfreproduktion, zweiterechts);
		
		//HAIE
		
		GridBagConstraints drittelinks = new GridBagConstraints();
		drittelinks.gridx=0;
		drittelinks.gridy=2;
		JLabel lhai = new JLabel("Haie");
		lhai.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(lhai, drittelinks);
		
		GridBagConstraints drittemitte = new GridBagConstraints();
		drittemitte.gridx=1;
		drittemitte.gridy=2;
		hanzahl = new JTextField("5000");
		hanzahl.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(hanzahl, drittemitte);
		
		GridBagConstraints dritterechts = new GridBagConstraints();
		dritterechts.gridx=2;
		dritterechts.gridy=2;
		JLabel lhanzahl = new JLabel("Anzahl");
		lhanzahl.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(lhanzahl, dritterechts);
		
		GridBagConstraints viertemitte = new GridBagConstraints();
		viertemitte.gridx=1;
		viertemitte.gridy=3;
		hlebensenergie = new JTextField("50");
		hlebensenergie.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(hlebensenergie, viertemitte);
		
		GridBagConstraints vierterechts = new GridBagConstraints();
		vierterechts.gridx=2;
		vierterechts.gridy=3;
		JLabel lhlebenseinergie = new JLabel("Lebensenergie");
		lhlebenseinergie.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(lhlebenseinergie, vierterechts);
		
		GridBagConstraints fünftemitte = new GridBagConstraints();
		fünftemitte.gridx=1;
		fünftemitte.gridy=4;
		TFhaifrisstfisch = new JTextField("20");
		TFhaifrisstfisch.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFhaifrisstfisch, fünftemitte);
		
		GridBagConstraints fünfterechts = new GridBagConstraints();
		fünfterechts.gridx=2;
		fünfterechts.gridy=4;
		JLabel Lhaifrisstfisch = new JLabel("Energiegewinn pro Fisch");
		Lhaifrisstfisch.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Lhaifrisstfisch, fünfterechts);
		
		GridBagConstraints sechstemitte = new GridBagConstraints();
		sechstemitte.gridx=1;
		sechstemitte.gridy=5;
		TFhaireproduktion = new JTextField("100");
		TFhaireproduktion.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFhaireproduktion, sechstemitte);
		
		GridBagConstraints sechsterechts = new GridBagConstraints();
		sechsterechts.gridx=2;
		sechsterechts.gridy=5;
		JLabel Lhaireproduktion = new JLabel("Reproduktionsenergie");
		Lhaireproduktion.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Lhaireproduktion, sechsterechts);
		
		//WALE
		
		GridBagConstraints sibbtelinks = new GridBagConstraints();
		sibbtelinks.gridx=0;
		sibbtelinks.gridy=6;
		JLabel labelwale = new JLabel("Wale");
		labelwale.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(labelwale, sibbtelinks);
		
		GridBagConstraints sibbtemitte = new GridBagConstraints();
		sibbtemitte.gridx=1;
		sibbtemitte.gridy=6;
		TFWalanzahl = new JTextField("5000");
		TFWalanzahl.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFWalanzahl, sibbtemitte);
		

		
		
		GridBagConstraints sibbterechts = new GridBagConstraints();
		sibbterechts.gridx=2;
		sibbterechts.gridy=6;
		JLabel Labelwalanzahl = new JLabel("Anzahl");
		Labelwalanzahl.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Labelwalanzahl, sibbterechts);

		GridBagConstraints achtemitte = new GridBagConstraints();
		achtemitte.gridx=1;
		achtemitte.gridy=7;
		TFWalenergie = new JTextField("100");
		TFWalenergie.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFWalenergie, achtemitte);
		
		GridBagConstraints achterechts = new GridBagConstraints();
		achterechts.gridx=2;
		achterechts.gridy=7;
		JLabel Labelwalenergie = new JLabel("Lebensenergie");
		Labelwalenergie.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Labelwalenergie, achterechts);
		
		GridBagConstraints neuntemitte = new GridBagConstraints();
		neuntemitte.gridx=1;
		neuntemitte.gridy=8;
		TFwalfrisstfisch = new JTextField("5");
		TFwalfrisstfisch.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFwalfrisstfisch, neuntemitte);
		
		GridBagConstraints neunterechts = new GridBagConstraints();
		neunterechts.gridx=2;
		neunterechts.gridy=8;
		JLabel Labelwalfrisstfisch = new JLabel("Energiegewinn pro Fisch");
		Labelwalfrisstfisch.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Labelwalfrisstfisch, neunterechts);
		
		GridBagConstraints zehntemitte = new GridBagConstraints();
		zehntemitte.gridx=1;
		zehntemitte.gridy=9;
		TFwalfrissthai = new JTextField("50");
		TFwalfrissthai.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFwalfrissthai, zehntemitte);
		
		GridBagConstraints zehnterechts = new GridBagConstraints();
		zehnterechts.gridx=2;
		zehnterechts.gridy=9;
		JLabel Labelwalfrissthai = new JLabel("Energiegewinn pro Hai");
		Labelwalfrissthai.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Labelwalfrissthai, zehnterechts);
		
		GridBagConstraints elftemitte = new GridBagConstraints();
		elftemitte.gridx=1;
		elftemitte.gridy=10;
		TFwalreproduktion = new JTextField("200");
		TFwalreproduktion.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(TFwalreproduktion, elftemitte);
		
		GridBagConstraints elfterechts = new GridBagConstraints();
		elfterechts.gridx=2;
		elfterechts.gridy=10;
		JLabel Labelwalreproduktion = new JLabel("Reproduktionsenergie");
		Labelwalreproduktion.setPreferredSize( new Dimension( 150, 24 ) );
		this.add(Labelwalreproduktion, elfterechts);
		
		// BUTTON
		

		
	}
	
	public void buttonsetzten(JButton JB){
		GridBagConstraints zwoelftemitte = new GridBagConstraints();
		zwoelftemitte.gridx=1;
		zwoelftemitte.gridy=11;
		JB.setPreferredSize( new Dimension( 100, 24 ) );
		this.add(JB, zwoelftemitte);
		
		
	}

	public JTextField getFanzahl() {
		return fanzahl;
	}

	public JTextField getFreproduktion() {
		return freproduktion;
	}

	public JTextField getHanzahl() {
		return hanzahl;
	}

	public JTextField getHlebensenergie() {
		return hlebensenergie;
	}

	public JTextField getTFhaifrisstfisch() {
		return TFhaifrisstfisch;
	}

	public JTextField getTFhaireproduktion() {
		return TFhaireproduktion;
	}

	public JTextField getTFWalanzahl() {
		return TFWalanzahl;
	}

	public JTextField getTFWalenergie() {
		return TFWalenergie;
	}

	public JTextField getTFwalfrisstfisch() {
		return TFwalfrisstfisch;
	}

	public JTextField getTFwalfrissthai() {
		return TFwalfrissthai;
	}

	public JTextField getTFwalreproduktion() {
		return TFwalreproduktion;
	}
}
