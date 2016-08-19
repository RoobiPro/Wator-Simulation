
public class Haie_erstellen {
	int energy;
	int anzahl;
	int arr[]= new int[150000];
	int fressenergy;
	int geburtszeitpunkt;
	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Haie_erstellen(int a, Kachel[] k, int e, int fe, int gz){
		kacheln = k;
		anzahl = a-1;
		energy = e;
		fressenergy = fe;
		geburtszeitpunkt = gz;
	}
	public void start(){
		
		int i=0;
		while(i<anzahl){
			int z = (int)(Math.random()*150000);
			if(!kacheln[z].isH()){
				
				kacheln[z].setH(true);
				
				Hai h = new Hai(energy, fressenergy, geburtszeitpunkt);
				h.setMoved(false);
				kacheln[z].setHAI(h);
				
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
