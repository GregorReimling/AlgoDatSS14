
public class Kettenfunktion implements Funktion
{
  Funktion f;
  Funktion g;

  public Kettenfunktion(Funktion f, Funktion g) {
    this.f = f;
    this.g = g;
  }

  public boolean istDefiniertFuer(double x) {
    return g.istDefiniertFuer(x) && f.istDefiniertFuer(g.wert(x));
  }
  public double wert(double x) {
    return f.wert(g.wert(x));
  }
  public String darstellung() {
    return "f(g(x)) mit g(x) = " + g.darstellung() + " und f(x) = " + f.darstellung();
  }
}
