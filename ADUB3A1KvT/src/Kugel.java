
public class Kugel extends Koerper {
	
	private double r;
	
	public Kugel(double x, double y, double z, double r) {
		super(x,y,z);
		this.r=r;
	}
	public double getR() {
		return this.r;
	}
	
	public void skaliere(double a) {
		this.r*=a;
	}
	
	public double volumen() {
		return ((4/3)*Math.PI*(r*r*r));
	}
	
	public double oberflaeche() {
		return (4*Math.PI*(r*r));
	}
	
	public double durchmesser() {
		return 2*r;
	}

}
