
public class Wal_Back_Evo {
	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Wal_Back_Evo(Kachel[] k){
		kacheln = k;
		for(int i=0; i<=149999;i++){
			if(kacheln[i].isW()){
				if(kacheln[i].getWal().getGZ()<=190){
					kacheln[i].getWal().setGZ((kacheln[i].getWal().getGZ())+10);
				}
			}
		}
	}
	
	Kachel[] getKacheln(){
		return kacheln;
	}
	
}
