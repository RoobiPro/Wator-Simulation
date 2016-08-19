
public class Wal {
	
	private
	
	boolean moved;
	int energy;
	int fischfressen;
	int haifressen;
	int geburtszeitpunkt;
	
	Wal (int leben, int ff, int hf, int gz){
		energy = leben;
		moved=false;
		fischfressen = ff;
		haifressen = hf;
		geburtszeitpunkt = gz;
	}
	
	public void fressenFISCH(){
		energy+=fischfressen;
	}
	
	public void fressenHAI(){
		energy+=haifressen;
	}
	
	int getEnergy(){
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
		return fischfressen;
	}
	
	public int getHF(){
		return haifressen;
	}
	
	public int getGZ(){
		return geburtszeitpunkt;
	}
	
	public void setGZ(int gz){
		geburtszeitpunkt=gz;
		
	}
}
