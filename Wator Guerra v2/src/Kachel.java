import java.awt.Color;


public class Kachel {
	
	private


	int x;
	int y;
	
	boolean W;
	boolean F;
	boolean H;

	Hai HAI;
	Fisch FISCH;
	Wal WAL;
	
	Kachel OB;
	Kachel UN;
	Kachel RE;
	Kachel LI;
	
	Color farbe;
	

	
	//getters

	public Color getColor(){
		return farbe;
	}
	
	public Kachel getOB() {
		return OB;
	}
	public Kachel getRE() {
		return RE;
	}
	public Kachel getLI() {
		return LI;
	}
	public Kachel getUN() {
		return UN;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean isF() {
		return F;
	}
	public boolean isW() {
		return W;
	}
	public boolean isH() {
		return H;
	}

	public Fisch getFisch(){
		return FISCH;
	}
	public Hai getHai(){
		return HAI;
	}
	public Wal getWal(){
		return WAL;
	}
	public boolean isempty(){
		if(!this.isF()&&!this.isH()&!this.isW()){
			return true;
		}
		else
			return false;
	}
	public boolean nachbarFrei(){
		if(this.getOB().isempty()||this.getRE().isempty()||this.getUN().isempty()||this.getLI().isempty())
			return true;
		
		else
			return false;
	}
	public boolean frei4shark(){
		if(!this.isW()&&!this.isH())
			return true;
		
		else
			return false;
		
	}	
	public boolean Nachbarfrei4shark(){
		if(this.getOB().frei4shark()||this.getRE().frei4shark()||this.getUN().frei4shark()||this.getLI().frei4shark())
			return true;
		
		else
			return false;
		
	}
	public boolean Nachbarfrei4wal(){
		if(!this.getOB().isW()||!this.getRE().isW()||!this.getUN().isW()||!this.getLI().isW()){
			return true;
		}
		
		else
			return false;
		
	}
	
	public boolean NachbarisFisch(){
		if(this.getOB().isF()||this.getRE().isF()||this.getUN().isF()||this.getLI().isF())
			return true;
		
		else
			return false;
		
	}
	public boolean NachbarisHai(){
		if(this.getOB().isH()||this.getRE().isH()||this.getUN().isH()||this.getLI().isH())
			return true;
		
		else
			return false;
		
	}

	//Setters
	
	public void setColor(Color f){
		farbe = f;
	}
	
	public void setOB(Kachel oB) {
		OB = oB;
	}
	public void setUN(Kachel uN) {
		UN = uN;
	}
	public void setRE(Kachel rE) {
		RE = rE;
	}
	public void setLI(Kachel lI) {
		LI = lI;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setW(boolean w) {
		W = w;
	}
	public void setF(boolean f) {
		F = f;
	}
	public void setH(boolean h) {
		H = h;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void setHAI(Hai h){
		HAI = h;
	}
	public void setFISCH(Fisch f){
		FISCH = f;
	}
	public void setWAL(Wal w){
		WAL= w;
	}
	
}
