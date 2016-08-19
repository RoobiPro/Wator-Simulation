
public class Geburt {

	Kachel[] kacheln = new Kachel[150000];
	int frei[]=new int[4];

	
	
	Geburt(Kachel[] k){
		kacheln = k;

	}
	
	public void gebaehren(){
		for(int i=0; i<=149999;i++){
			
			//WAL GEBURT
			if(kacheln[i].isW()&&kacheln[i].Nachbarfrei4wal()){				
				
				if(kacheln[i].getWal().getEnergy()>=kacheln[i].getWal().getGZ()&&kacheln[i].Nachbarfrei4wal()){
					
					kacheln[i].getWal().setEnergy(kacheln[i].getWal().getEnergy()/2);
					Wal w = new Wal(kacheln[i].getWal().getEnergy(), kacheln[i].getWal().getFF(),kacheln[i].getWal().getHF(),kacheln[i].getWal().getGZ());
					
					while(kacheln[i].Nachbarfrei4wal()){

						int z = (int)(Math.random()*4);
						if (z==0){
							if(!kacheln[i].getOB().isW()){
								kacheln[i].getOB().setWAL(w);
								kacheln[i].getOB().setW(true);
								break;
							}
						}
						else if (z==1){
							if(!kacheln[i].getRE().isW()){
								kacheln[i].getRE().setWAL(w);
								kacheln[i].getRE().setW(true);
								break;
							}
						}
						else if (z==2){
							if(!kacheln[i].getUN().isW()){
								kacheln[i].getUN().setWAL(w);
								kacheln[i].getUN().setW(true);
								break;
							
							}
						}
						else if (z==3){
							if(!kacheln[i].getLI().isW()){
								kacheln[i].getLI().setWAL(w);
								kacheln[i].getLI().setW(true);
								break;
							}
	
						}
						
					}
					
				}
			}
			
			
			//HAI GEBURT
			else if(kacheln[i].isH()&&kacheln[i].Nachbarfrei4shark()){
				if(kacheln[i].getHai().getEnergy()>=kacheln[i].getHai().getGZ()&&kacheln[i].Nachbarfrei4shark()){
			
					kacheln[i].getHai().setEnergy(kacheln[i].getHai().getEnergy()/2);
					Hai h = new Hai(kacheln[i].getHai().getEnergy(), kacheln[i].getHai().getFF(),kacheln[i].getHai().getGZ() );
					
					while(kacheln[i].Nachbarfrei4shark()){
		
						int z = (int)(Math.random()*4);
						if (z==0){
							if(kacheln[i].getOB().frei4shark()){
								kacheln[i].getOB().setHAI(h);
								kacheln[i].getOB().setH(true);
								break;
							}
						}
						else if (z==1){
							if(kacheln[i].getRE().frei4shark()){
								kacheln[i].getRE().setHAI(h);
								kacheln[i].getRE().setH(true);
								break;
							}
						}
						else if (z==2){
							if(kacheln[i].getUN().frei4shark()){
								kacheln[i].getUN().setHAI(h);
								kacheln[i].getUN().setH(true);
								break;
							
							}
						}
						else if (z==3){
							if(kacheln[i].getLI().frei4shark()){
								kacheln[i].getLI().setHAI(h);
								kacheln[i].getLI().setH(true);
								break;
							}
	
						}
						
					}
				}
			}
			//FISCH GEBURT
			else if(kacheln[i].isF()&&kacheln[i].nachbarFrei()){
				if(kacheln[i].getFisch().getAlter()>=kacheln[i].getFisch().getGeburt()&&kacheln[i].nachbarFrei()){
					
					Fisch f1 = new Fisch(kacheln[i].getFisch().getGeburt());
					Fisch f2 = new Fisch(kacheln[i].getFisch().getGeburt());
					kacheln[i].setFISCH(f1);
					kacheln[i].setF(true);
					
					while(kacheln[i].nachbarFrei()){

						int z = (int)(Math.random()*4);
						if (z==0){
							if(kacheln[i].getOB().isempty()){
								kacheln[i].getOB().setFISCH(f2);
								kacheln[i].getOB().setF(true);
								break;
							}
						}
						if (z==1){
							if(kacheln[i].getRE().isempty()){
								kacheln[i].getRE().setFISCH(f2);
								kacheln[i].getRE().setF(true);
								break;
							}
						}
						if (z==2){
							if(kacheln[i].getUN().isempty()){
								kacheln[i].getUN().setFISCH(f2);
								kacheln[i].getUN().setF(true);
								break;
						
							}	
						}
						if (z==3){
							if(kacheln[i].getLI().isempty()){
								kacheln[i].getLI().setFISCH(f2);
								kacheln[i].getLI().setF(true);
								break;
							}
	
						}
					}
				}
			}

		}
	
}
	
	public Kachel[] getKacheln(){
		return kacheln;
	}
	
}