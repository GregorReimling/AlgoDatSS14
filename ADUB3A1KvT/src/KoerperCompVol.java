
public class KoerperCompVol implements Skalierbar, Comparable{
	
	Koerper k;
	
	public KoerperCompVol(Koerper k) {
		this.k=k;
	}
	
	public void skaliere(double a) {
		this.k.skaliere(a);
	}
	
	public double volumen() {
		return this.k.volumen();
	}
	
	public double oberflaeche() {
		return this.k.oberflaeche();
	}
	
	public double durchmesser() {
		return this.k.durchmesser();
	}
	
	public int compareTo(Object o) {
		if (this.k.volumen()>((KoerperCompVol)o).volumen()) {
			return -1;
		}
		else if (this.k.volumen()<((KoerperCompVol)o).volumen()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	
	
	
	
	

}
