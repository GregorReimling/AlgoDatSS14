
public class Polynom {
	
	private double [] koeffizienten;
	
	public Polynom (double [] koeffizienten) {
		this.koeffizienten=koeffizienten.clone();
	}
	
	public boolean istDefiniertFuer(double x) {
		return true;
	}
	
	public double wert(double x) {
		double ergebnis=0;
		
		for (int i=0;i<koeffizienten.length;i++) {
			ergebnis+=koeffizienten[i]*Math.pow(x, i);
		}
		
		return ergebnis;
		
	}
	
	public String darstellung() {
		return "x^n + ... + x^1 + x^0";
	}

}
