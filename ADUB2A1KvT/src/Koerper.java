
/*
 * 
 */

public abstract class Koerper implements Skalierbar{
	
	private double x, y, z;
	
	public Koerper(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void skaliere(double a) {
		this.x+=a;
		this.y+=a;
		this.z+=a;
	}
	
	public abstract double volumen();
	
	public abstract double oberflaeche();
	
	public abstract double durchmesser();

}
