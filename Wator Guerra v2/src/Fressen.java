
public class Fressen {

	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Fressen(Kachel[] k){
		kacheln = k;
	}
	
	public void eat(){
		for(int i=0; i<=149999;i++){
			
			//HAI FRISST FISCH
			  if( kacheln[i].isH() && kacheln[i].isF() && !kacheln[i].isW()){
				  
				  kacheln[i].getHai().fressen();
				  kacheln[i].setF(false);
				  kacheln[i].setFISCH(null);

				 // Hai h = kacheln[i].getHai();
				 // h.fressen();  
				  //kacheln[i].setHAI(h);
			  }
			  //WAL FRISST HAI
			  else if (kacheln[i].isW()&&kacheln[i].isH()&&!kacheln[i].isF()){
				  kacheln[i].getWal().fressenHAI();
				  kacheln[i].setH(false);
				  kacheln[i].setHAI(null);
			  }
		/*	  else if(kacheln[i].isW()&&kacheln[i].isH()&&kacheln[i].isF()){
				  kacheln[i].getHai().fressen();
				  kacheln[i].setF(false);
				  kacheln[i].setFISCH(null);
				  kacheln[i].getWal().fressenHAI();
				  kacheln[i].setH(false);
				  kacheln[i].setHAI(null); 
				  
			  } */
			  //WAL FRISST FISCH
			 else if(kacheln[i].isW()&&!kacheln[i].isH()&&kacheln[i].isF()){
				  kacheln[i].getWal().fressenFISCH();
				  kacheln[i].setF(false);
				  kacheln[i].setFISCH(null);				  
			  } 
			 else if(kacheln[i].isW()&&kacheln[i].isH()&&kacheln[i].isF()){
				  kacheln[i].getWal().fressenFISCH();
				  kacheln[i].setF(false);
				  kacheln[i].setFISCH(null);
				  kacheln[i].getWal().fressenHAI();
				  kacheln[i].setH(false);
				  kacheln[i].setHAI(null);
			  
			  } 
			  
		}
	}
	
	public Kachel[] getKacheln(){
		return kacheln;
	}
	
}
