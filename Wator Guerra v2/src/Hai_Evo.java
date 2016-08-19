
public class Hai_Evo {
	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Hai_Evo(Kachel[] k){
		kacheln = k;
		for(int i=0; i<=149999;i++){
			if(kacheln[i].isH()){
				if(kacheln[i].getHai().getGZ()>=10){
					kacheln[i].getHai().setGZ((kacheln[i].getHai().getGZ())-5);
				}
			}
		}
	}
	
	Kachel[] getKacheln(){
		return kacheln;
	}

}
