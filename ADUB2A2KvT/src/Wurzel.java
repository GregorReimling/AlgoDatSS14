
public class Wurzel implements Funktion {
	
	public boolean istDefiniertFuer(double x) {
		return true;
	}
	
	public double wert(double x) {
		return Math.sqrt(x);
	}
	
	public String darstellung() {
		return "sqrt(x)";
	}

}
