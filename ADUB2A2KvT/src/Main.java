
public class Main {
  public static void main(String[] args) {
    Funktion f = new Parabel(2, 0, 0);     // f(x) = x^2
    Funktion g = new Sinus();              // f(x) = sin(x)
    Funktion fg = new Kettenfunktion(f,g); // f(x) = (sin(x))^2

    Wertetabelle.druckeWertetabelle(f, 0.0, 1.0, 7);
    System.out.println();
    Wertetabelle.druckeWertetabelle(g, 0.0, Math.PI, 7);
    System.out.println();
    Wertetabelle.druckeWertetabelle(fg, 0.0, Math.PI, 7);
  }
}
