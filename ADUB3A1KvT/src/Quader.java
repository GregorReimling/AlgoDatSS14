
public class Quader extends Koerper {
	
	private double b,t,h;
	
	public Quader(double x, double y, double z, double b, double t, double h) {
		super(x,y,z);
		this.b=b;
		this.h=h;
		this.t=t;
	}
	
	public void skaliere(double a) {
		this.b*=a;
		this.h*=a;
		this.t*=a;
	}
	
	public double volumen(){
		return b*h*t;
	}
	
	public double oberflaeche(){
		return 2*((b*h)+(b*t)+(h*t));
	}
	
	public double durchmesser(){
		return Math.sqrt((b*b)+(h*h)+(t*t));
	}

}
