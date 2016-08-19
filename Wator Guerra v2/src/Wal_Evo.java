
public class Wal_Evo {
	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Wal_Evo(Kachel[] k){
		kacheln = k;
		for(int i=0; i<=149999;i++){
			if(kacheln[i].isW()){
				if(kacheln[i].getWal().getGZ()>=20){
					kacheln[i].getWal().setGZ((kacheln[i].getWal().getGZ())-10);
				}
			}
		}
	}
	
	Kachel[] getKacheln(){
		return kacheln;
	}
}
