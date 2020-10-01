package lab_7_uke40_klasser_kvadrat;

public class Kvadrat_test {

	public static void main(String[] args) {
		Kvadrat kv3 = new Kvadrat(3);
		Kvadrat kv4 = new Kvadrat(4);
		Kvadrat kv5 = new Kvadrat(5);
		
		kv3.skrivUt();
		System.out.println("Arealet av kvadrat objekt 1 er: " + kv3.areal());
		System.out.println("Omkretsen av kvadrat objekt 1 er: " + kv3.omkrets());
		System.out.println("Diagonalen av kvadrat objekt 1 er: " + kv3.diagonal());
		System.out.print("\n");
		kv4.skrivUt();
		System.out.println("Areal av kvadrat objekt 2 er: " + kv4.areal());
		System.out.println("Omkretsen av kvadrat objekt 2 er: " + kv4.omkrets());
		System.out.println("Diagonal av kvadrat objekt 2 er: " + kv4.diagonal());
		System.out.print("\n");
		kv5.skrivUt();
		System.out.println("Areal av kvadrat objekt 3 er: " + kv5.areal());
		System.out.println("Omkretsen av kvadrat objekt 3 er: " + kv5.omkrets());
		System.out.println("Diagonal av kvadrat objekt 3 er: " + kv5.diagonal());
		
		
		
	}
	
		
	}



