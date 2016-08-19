
public class Fisch_Evo {
	
	public static Kachel[] kacheln = new Kachel[150000];
	
	Fisch_Evo(Kachel[] k){
		kacheln = k;
		for(int i=0; i<=149999;i++){
			if(kacheln[i].isF()){
				if(kacheln[i].getFisch().getGeburt()>=2){
					kacheln[i].getFisch().setGeburt((kacheln[i].getFisch().getGeburt())-1);
				}
			}
		}
	}
	
	Kachel[] getKacheln(){
		return kacheln;
	}

}
