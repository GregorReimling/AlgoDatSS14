
public class RezWurzel implements Funktion {
	
	Reziprok r = new Reziprok();
	Wurzel w = new Wurzel();
	Abs a = new Abs();
	
	Kettenfunktion k = new Kettenfunktion(r, new Kettenfunktion (w, a));
	
	
	public boolean istDefiniertFuer(double x) {
		return x > 0 || x < 0;
	}
	
	public double wert(double x) {
		return k.wert(x);
	}
	
	public String darstellung() {
		return k.darstellung();
		
	}
	

}
