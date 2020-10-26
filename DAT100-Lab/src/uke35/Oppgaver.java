package uke35;

public class Oppgaver {
	//Oppgave 1
		/*
		public static void main(String[] args) {
			String a = showInputDialog("Skriv inn prisen: ");
			int pris = Integer.parseInt(a);
			
			String b = showInputDialog("Skriv inn beløpet du har: ");
			int beløp = Integer.parseInt(b);
			
			int veksel = beløp-pris;
			int antall_tiere = veksel/10;
			int antall_enere = veksel%10;
			
			showMessageDialog(null, "Antall tiere er: " + antall_tiere
					+ " Antall enere: " + antall_enere);
		}

			
			
	//Oppgave 2
	//b)
		
		public void main(String[] args) {
			double r = 5;
			double kulevolum = 4/3*PI*pow(r, 3);
			
			System.out.println(kulevolum);
		}

		
	//Oppgave 3
		
		public static void main(String[] args) {
			String en = showInputDialog("skriv inn et tall: ");
			String to = showInputDialog("Skriv inn et tall: ");
			double a = Integer.parseInt(en);
			double b = Integer.parseInt(to);
			
			if (b != 0 ) {
				System.out.print(a/b);	
			}
			else {
				System.out.print("Kan ikke dele med 0!!!!!!!!!!!!");
			}
		
		}


	//Oppgave 4
		
		public static void main(String[] args) {
			String brukernavn = showInputDialog("Brukernavn :");
			String RB = "andersm123";
			String passord = showInputDialog("Passord :");
			String RP = "rasstapp";
			
			if (brukernavn.equals(RB) && passord.equals(RP)) {
				System.out.println(brukernavn);
				System.out.println(passord);
			}
			else {
				System.out.print("Feil brukernavn eller passord");
			}
			
			
		}
		

	//Oppgave 5
		//Du skal lage et program som leser inn tre heltall fra brukeren, og skriver ut igjen tallene sortert i stigende rekkefølge.
	   // Løs oppgaven ved bare å bruke if-setninger.
	   // Løs oppgaven ved å bruke if-else-setninger
		
		
		public static void main(String[] args) {
		
			String a = showInputDialog("Skriv inn tall a: ");
			int t_a = Integer.parseInt(a);
			
			String b = showInputDialog("Skriv inn tall b: ");
			int t_b = Integer.parseInt(b);
			
			String c = showInputDialog("Skriv inn tall c: ");
			int t_c = Integer.parseInt(c);
			
			if (t_a > t_b) {
			int temp = t_a;
			t_a = t_b;
			t_b=temp;
			}
			
			if (t_b > t_c) {
			int temp = t_b;
			t_b = t_c;
			t_c = temp;
			}
			
			if (t_a > t_b) {
				int temp = t_a;
				t_a = t_b;
				t_b = temp;
			}
			
			System.out.println("Sorterte tall i stigende rekkefølge: " + t_a + ", " + t_b + ", " + t_c);
		}
			
		*/
}
