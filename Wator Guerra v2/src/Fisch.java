public class Fisch {

	private
	
	int alter;
	int geburt;
	
	boolean moved;
	
	Fisch (int g){
		alter = 0;
		moved=false;
		geburt=g;
	}
	
	public int getAlter(){
		return alter;
	}
	public void altern(int alterschritt){
		alter+=alterschritt;
		moved=true;
	}
	public boolean getMoved(){
		return moved;
	}
	public void setMoved(boolean m){
		moved=m;
	}
	public int getGeburt(){
		return geburt;
	}
	public void setGeburt(int g){
		geburt=g;
	}
}

