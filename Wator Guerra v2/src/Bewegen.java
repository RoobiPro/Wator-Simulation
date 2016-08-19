
public class Bewegen {
	
	Kachel[] kacheln = new Kachel[150000];
	int moveenergy;
	int fischalterung;
	
	Bewegen(Kachel[] k, int MoveEnergy, int Fischalterung){
		kacheln = k;
		moveenergy = MoveEnergy;
		fischalterung = Fischalterung;
	}

	public void bewegen(){
		for(int i=0; i<=149999;i++){
			//WAL BEWEGEN
			

			
			// IST EIN WAL
			if(kacheln[i].isW()&&!kacheln[i].getWal().getMoved()&&kacheln[i].Nachbarfrei4wal()){
				kacheln[i].getWal().bewegen(moveenergy);
				
				//HAI NACHBAR
				if(kacheln[i].NachbarisHai()){
					while(kacheln[i].NachbarisHai()){
						int z = (int)(Math.random()*4);
						if (z==0){
							if(kacheln[i].getOB().isH()){
								kacheln[i].getOB().setWAL(kacheln[i].getWal());
								kacheln[i].getOB().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
						}
						else if (z==1){
								if(kacheln[i].getRE().isH()){
								kacheln[i].getRE().setWAL(kacheln[i].getWal());
								kacheln[i].getRE().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
						}
						else if (z==2){
								if(kacheln[i].getUN().isH()){
									kacheln[i].getUN().setWAL(kacheln[i].getWal());
									kacheln[i].getUN().setW(true);
									kacheln[i].setWAL(null);
									kacheln[i].setW(false);
									break;
								}
							}
						else if (z==3){
								if(kacheln[i].getLI().isH()){
									kacheln[i].getLI().setWAL(kacheln[i].getWal());
									kacheln[i].getLI().setW(true);
									kacheln[i].setWAL(null);
									kacheln[i].setW(false);
									break;
								}
							}
						}
					} 
				//ENDE HAINACHBAR
				
				//NACHBAR FISCH
			else if(!kacheln[i].NachbarisHai()&&kacheln[i].NachbarisFisch()){
					while(kacheln[i].NachbarisFisch()){
						int z = (int)(Math.random()*4);
							if (z==0){
								if(kacheln[i].getOB().isF()){
								kacheln[i].getOB().setWAL(kacheln[i].getWal());
								kacheln[i].getOB().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
						}
							else if (z==1){
								if(kacheln[i].getRE().isF()){
								kacheln[i].getRE().setWAL(kacheln[i].getWal());
								kacheln[i].getRE().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
						}
							else if (z==2){
								if(kacheln[i].getUN().isF()){
									kacheln[i].getUN().setWAL(kacheln[i].getWal());
									kacheln[i].getUN().setW(true);
									kacheln[i].setWAL(null);
									kacheln[i].setW(false);
									break;
								}
							}
							else if (z==3){
								if(kacheln[i].getLI().isF()){
									kacheln[i].getLI().setWAL(kacheln[i].getWal());
									kacheln[i].getLI().setW(true);
									kacheln[i].setWAL(null);
									kacheln[i].setW(false);
									break;
								}
							}
						}
					} 
					//ENDE NACHBAR FISCH
				//KEIN NACHBAR
				else{
					while(kacheln[i].Nachbarfrei4wal()){
						int z = (int)(Math.random()*4);
						if (z==0){
							if(kacheln[i].getOB().isempty()){
								kacheln[i].getOB().setWAL(kacheln[i].getWal());
								kacheln[i].getOB().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
						}
						else if (z==1){
							if(kacheln[i].getRE().isempty()){
								kacheln[i].getRE().setWAL(kacheln[i].getWal());
								kacheln[i].getRE().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
						}
						else if (z==2){
							if(kacheln[i].getUN().isempty()){
								kacheln[i].getUN().setWAL(kacheln[i].getWal());
								kacheln[i].getUN().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							
							}
						}
						else if (z==3){
							if(kacheln[i].getLI().isempty()){
								kacheln[i].getLI().setWAL(kacheln[i].getWal());
								kacheln[i].getLI().setW(true);
								kacheln[i].setWAL(null);
								kacheln[i].setW(false);
								break;
							}
	
						}
					}	
					
				}
				//ENDE KEIN NACHBAR
				
			}

			
			//HAI BEWEGEN 
			
			if(kacheln[i].isH()&&!kacheln[i].getHai().getMoved()&&kacheln[i].Nachbarfrei4shark()){
	
				kacheln[i].getHai().bewegen(moveenergy);
	
				  if(kacheln[i].NachbarisFisch()){
					  while(kacheln[i].NachbarisFisch()){
						  int z = (int)(Math.random()*4);
							if (z==0){
								if(kacheln[i].getOB().isF()){
									kacheln[i].getOB().setHAI(kacheln[i].getHai());
									kacheln[i].getOB().setH(true);
									kacheln[i].setHAI(null);
									kacheln[i].setH(false);
									break;
								}
							}
							else if (z==1){
									if(kacheln[i].getRE().isF()){
									kacheln[i].getRE().setHAI(kacheln[i].getHai());
									kacheln[i].getRE().setH(true);
									kacheln[i].setHAI(null);
									kacheln[i].setH(false);
									break;
								}
							}
							else if (z==2){
								if(kacheln[i].getUN().isF()){
									kacheln[i].getUN().setHAI(kacheln[i].getHai());
									kacheln[i].getUN().setH(true);
									kacheln[i].setHAI(null);
									kacheln[i].setH(false);
									break;
								}
							}
							else if (z==3){
								if(kacheln[i].getLI().isF()){
									kacheln[i].getLI().setHAI(kacheln[i].getHai());
									kacheln[i].getLI().setH(true);
									kacheln[i].setHAI(null);
									kacheln[i].setH(false);
									break;
								}
							}
					  }
				  }
				  else if(kacheln[i].nachbarFrei()){
					  
					while(kacheln[i].Nachbarfrei4shark()&&!kacheln[i].NachbarisFisch()){
						int z = (int)(Math.random()*4);
						if (z==0){
							if(kacheln[i].getOB().frei4shark()){
								kacheln[i].getOB().setHAI(kacheln[i].getHai());
								kacheln[i].getOB().setH(true);
								kacheln[i].setHAI(null);
								kacheln[i].setH(false);
								break;
							}
						}
						else if (z==1){
							if(kacheln[i].getRE().frei4shark()){
								kacheln[i].getRE().setHAI(kacheln[i].getHai());
								kacheln[i].getRE().setH(true);
								kacheln[i].setHAI(null);
								kacheln[i].setH(false);
								break;
							}
						}
						else if (z==2){
							if(kacheln[i].getUN().frei4shark()){
								kacheln[i].getUN().setHAI(kacheln[i].getHai());
								kacheln[i].getUN().setH(true);
								kacheln[i].setHAI(null);
								kacheln[i].setH(false);
								break;
							
							}
						}
						else if (z==3){
							if(kacheln[i].getLI().frei4shark()){
								kacheln[i].getLI().setHAI(kacheln[i].getHai());
								kacheln[i].getLI().setH(true);
								kacheln[i].setHAI(null);
								kacheln[i].setH(false);
								break;
							}
						}
					}
				 }
			  }
			  
			  //FISCHE BEWEGEN
			  
			  if( kacheln[i].isF()&&!kacheln[i].getFisch().getMoved()&&kacheln[i].nachbarFrei()){
				  kacheln[i].getFisch().altern(fischalterung);			
				
					while(kacheln[i].nachbarFrei()){
						int z = (int)(Math.random()*4);
						if (z==0){
							if(kacheln[i].getOB().isempty()){
								kacheln[i].getOB().setFISCH(kacheln[i].getFisch());
								kacheln[i].getOB().setF(true);
								kacheln[i].setFISCH(null);
								kacheln[i].setF(false);
								break;
							}
						}
						else if (z==1){
							if(kacheln[i].getRE().isempty()){
								kacheln[i].getRE().setFISCH(kacheln[i].getFisch());
								kacheln[i].getRE().setF(true);
								kacheln[i].setFISCH(null);
								kacheln[i].setF(false);
								break;
							}
						}
						else if (z==2){
							if(kacheln[i].getUN().isempty()){
								kacheln[i].getUN().setFISCH(kacheln[i].getFisch());
								kacheln[i].getUN().setF(true);
								kacheln[i].setFISCH(null);
								kacheln[i].setF(false);
								break;
							
							}
						}
						else if (z==3){
							if(kacheln[i].getLI().isempty()){
								kacheln[i].getLI().setFISCH(kacheln[i].getFisch());
								kacheln[i].getLI().setF(true);
								kacheln[i].setFISCH(null);
								kacheln[i].setF(false);
								break;
							}
	
						}
					}				
			  } 
			  
			  /*
			  if(kacheln[i].isW()&&kacheln[i].getWal().getMoved()){
				  kacheln[i].getWal().bewegen(moveenergy);
			  }
			  if(kacheln[i].isH()&&kacheln[i].getHai().getMoved()){
				  kacheln[i].getHai().bewegen(moveenergy);
			  }
			  if(kacheln[i].isF()&&kacheln[i].getFisch().getMoved()){
				  kacheln[i].getFisch().altern(fischalterung);		
			  } */

	}
	for(int i=0; i<=149999;i++){
		  if(kacheln[i].isH()){
			  kacheln[i].getHai().setMoved(false);
		  }
		  else if(kacheln[i].isF()){
			  kacheln[i].getFisch().setMoved(false);
		  }
		  else if(kacheln[i].isW()){
			  kacheln[i].getWal().setMoved(false);
		  }
	}
		 
}
	public Kachel[] getKacheln(){
		return kacheln;
	}
	
}
