
public class Fisch_Back_Evo {

	public static Kachel[] kacheln = new Kachel[150000];
	
	Fisch_Back_Evo(Kachel[] k){
		kacheln = k;
		for(int i=0; i<=149999;i++){
			if(kacheln[i].isF()){
				if(kacheln[i].getFisch().getGeburt()<=19){
					kacheln[i].getFisch().setGeburt((kacheln[i].getFisch().getGeburt())+1);
				}
			}
		}
	}
	
	Kachel[] getKacheln(){
		return kacheln;
	}	
	
}
