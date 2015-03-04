
public class Abs implements Funktion{
	
	public boolean istDefiniertFuer(double x) {
		return true;
	}
	
	public double wert(double x) {
		return x;
	}
	
	public String darstellung() {
		return "|x|";
	}

}
