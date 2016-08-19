import java.awt.Color;

public class Statistics_kachel {
	
private 

int Yfisch;
int YHai;
int YWal;
int X;


Color Fisch = new Color(124,252,0);
Color Hai = new Color(0,0,128);
Color Wal = new Color(165,42,42);

Statistics_kachel(){
	
}

Statistics_kachel(int xk){
	X=xk;
}

public void setYfisch(int yfisch) {
	Yfisch =200-yfisch/400;
}
public void setYHai(int yHai) {
	YHai =200-yHai/100;
}
public void setYWal(int yWal) {
	YWal = 200-yWal/100;
}

public int getYfisch() {
	return Yfisch;
}

public int getYHai() {
	return YHai;
}

public int getYWal() {
	return YWal;
}

public int getX() {
	return X;
}
public void setX(int x) {
	X = x;
}
public Color getFisch() {
	return Fisch;
}
public void setFisch(Color fisch) {
	Fisch = fisch;
}
public Color getHai() {
	return Hai;
}
public void setHai(Color hai) {
	Hai = hai;
}
public Color getWal() {
	return Wal;
}
public void setWal(Color wal) {
	Wal = wal;
}






}
