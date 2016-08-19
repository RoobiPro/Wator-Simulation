
public class Sterben {

	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Sterben(Kachel[] k){
		kacheln = k;
	}
	
	public void kill(){
		for(int i=0; i<=149999;i++){
				  if(kacheln[i].isH()&&kacheln[i].getHai().getEnergy()<=0){
					  kacheln[i].setH(false);
					  kacheln[i].setHAI(null);
					  
				  }				
				  if(kacheln[i].isW()&&kacheln[i].getWal().getEnergy()<=0){
					  kacheln[i].setW(false);
					  kacheln[i].setWAL(null);
				  }
			  
		}
		
	}
	
	public Kachel[] getKacheln(){
		return kacheln;
	}
	
}
