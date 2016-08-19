
public class Hai {

	private
	

	int energy;
	int fressenergy;
	int geburtszeitpunkt;
	
	boolean moved;
	
	
	Hai (int leben, int fe, int gz){
		energy = leben;
		moved=false;
		fressenergy = fe;
		geburtszeitpunkt = gz;
	}
	
	public void fressen(){
		energy+=fressenergy;
	}
	
	public int getEnergy(){
		return energy;
	}
	
	public void setEnergy(int e){
		energy = e;
	}
	
	public void bewegen(int moveenergy){
		energy-=moveenergy;
		moved =true;
	}
	public boolean getMoved(){
		return moved;
	}
	public void setMoved(boolean m){
		moved=m;
	}
	public int getFF(){
		return fressenergy;
	}
	public int getGZ(){
		return geburtszeitpunkt;
	}
	
	public void setGZ(int gz){
		geburtszeitpunkt=gz;
		
	}
	
}
