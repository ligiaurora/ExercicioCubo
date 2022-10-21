package cubo;
import java.lang.Math; 

public class Cubo {

	private double a;
	private double m;
	private int tinta;
	
	public Cubo(double a, double m, int tinta) {
		this.a = a;
		this.m = m;
		this.tinta = tinta;
	}

	public double getA() {
		return a;
	}



	public void setA(double a) {
		this.a = a;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public int getTinta() {
		return tinta;
	}

	public void setTinta(int tinta) {
		this.tinta = tinta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cubo [a=");
		builder.append(a);
		builder.append(", m=");
		builder.append(m);
		builder.append(", tinta=");
		builder.append(tinta);
		builder.append("]");
		return builder.toString();
	}

}
