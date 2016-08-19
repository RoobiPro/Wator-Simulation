
public class Fische_erstellen {
	int anzahl;
	int arr[]= new int[150000];
	int rep;
	int[] a = {1,2,3,4};
	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Fische_erstellen(int a, Kachel[] k, int r){
		kacheln = k;
		anzahl = a-1;
		rep = r;
		
	}
	public void start(){
		
		int i=0;
		while(i<=anzahl){
			int z = (int)(Math.random()*150000);
			if(!kacheln[z].isF()){
				
				
				kacheln[z].setF(true);
				
				Fisch f = new Fisch(rep);
				
				kacheln[z].setFISCH(f);
				
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
