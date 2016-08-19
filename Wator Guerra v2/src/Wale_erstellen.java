
public class Wale_erstellen {
	int energy;
	int anzahl;
	int arr[]= new int[150000];
	int fressfischene;
	int fresshaiene;
	int geburtszeitpunkt;
	public static Kachel[] kacheln = new Kachel[150000];
	
	Wale_erstellen(int a, Kachel[] k, int e, int fe, int fh, int gz){
		kacheln = k;
		anzahl = a-1;
		energy = e;
		fressfischene = fe;
		fresshaiene = fh;
		geburtszeitpunkt = gz;
	}
	public void start(){
		
		int i=0;
		while(i<anzahl){
			int z = (int)(Math.random()*150000);
			if(!kacheln[z].isW()){
								
				kacheln[z].setW(true);
				
				Wal w = new Wal(energy,fressfischene,fresshaiene,geburtszeitpunkt);
				w.setMoved(false);
				kacheln[z].setWAL(w);
				
				arr[i]=z;
				i++;
			}

		}
		
	}
	
	public static boolean vorhanden(int arr[], int ueber, int ende) {
		for(int i=0;i<=ende;i++){
			if(arr[i]==ueber){
				return true;				
			}
		}
		return false;
	}
	
	public Kachel[] getKacheln(){
		return kacheln;
	}

}
