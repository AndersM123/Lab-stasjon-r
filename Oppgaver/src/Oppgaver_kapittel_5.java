import static javax.swing.JOptionPane.*;

public class Oppgaver_kapittel_5 {

//1)	
	/*
	public static void main(String[] args) {
		int [] tabell = {1,3,4,7};
		String tall = showInputDialog("Skriv et siffer mellom 0 og 9: ");
		int tall1 = Integer.parseInt(tall);
		
		int antall = 0;
		
		
		
		for (int i=0; i<tabell.length; i++) {
			if (tabell[i] < tall1) {
			antall++;	
			}
			
		}
		System.out.print(antall);
		

	}
*/

//2)
	/*
	//sorter tabellen i synkende rekkefølge
	public static void main(String[] args) {
		int tabell [] = {5,8,3,2,9};
					//   0,1,2,3,4
		int temp;
		boolean synkende=false;
		
		while(synkende==false) {
		//while eller (så lenge)* synkende rekkefølge ikke er sant, vil denne forløkken kjøre om 
		// igjen og om igjen til den er sortert i synkende rekkefølge. nå mangler bare en "sjekk".
			
		synkende=true;
		//når index 0 og 1 er byttet slik at de er synkende, gå til neste.
			
			for (int i=0; i<tabell.length-1; i++) {
			//tabell.length-1 fordi den ikke kan kjøre 5 ganger, den tar index 0 med 1, 1 med 2
			//2 med 3 og 4 med 5. For hva skal 5 bytte med når det ikke er en 5. index?
			if (tabell[i] < tabell[i+1]) {
				// if 5   <    8
				temp = tabell[i+1];
				//tar vare på 8 i "temp"
				tabell[i+1]=tabell[i];
				//setter 5 inn der 8 står
				tabell[i]=temp;
				//setter inn 8 der 5 stod
				synkende=false;
				//Denne settes inn fordi den skal vise at selv med 1 eller 2 if's er kjørt, er ikke hele rekken true!
				//For hvis if løkken ikke lenger kjører, er det fordi rekken er sortert synkende. 
				//og linjen synkende=false, blir ignorert fordi if løkken ikke lenger blir brukt.
			}
			
		}
		
	}
		for (int i=0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}
*/
	
}
