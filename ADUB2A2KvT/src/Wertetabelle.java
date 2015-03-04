
public class Wertetabelle {
  public static void druckeWertetabelle(Funktion f, double von, double bis, int n) {
    double h = (bis - von) / (n + 1);
    System.out.println("f(x) = " + f.darstellung());
    double x = von;
    for (int i=0 ; i<=n+1 ; i++) {
      System.out.println("f(" + x + ") " +
                         (f.istDefiniertFuer(x) ? "= " + f.wert(x) : "ist nicht definiert"));
      x += h;
    }
  }
}
