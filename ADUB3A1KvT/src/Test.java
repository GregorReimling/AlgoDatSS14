
public class Test {
	
	public static void main (String [] args) {
		Kugel k1 = new Kugel(15, 16, 15, 5);
		Kugel k2 = new Kugel(30, 32, 30, 10);
		
		Quader q1= new Quader(10, 10, 10, 10, 10,10);
		Quader q2=new Quader(20, 20, 20, 20, 20, 20);
		
		Koerper [] ka = new Koerper[1];
		ka[0]=k1;
		ka[1]=k2;
		
		System.out.println("Kugel k1 Volumen: " + k1.volumen() + " Durchmesser: " + k1.durchmesser() + " Oberflaeche: " + k1.oberflaeche());
		System.out.println("Quader q1 Volumen: " + q1.volumen() + " Durchmesser: " + k1.durchmesser() + " Oberflaeche : " + k1.oberflaeche());
		System.out.println("Sortiere k1 und k2: " + Sort.sortiere(a));
	}

}
