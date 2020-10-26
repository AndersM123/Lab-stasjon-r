package uke35;

import static javax.swing.JOptionPane.*;

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
*/
			
			
	//Oppgave 2
	//b)
		/*
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
*/

	//Oppgave 4
		/*
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
		*/

	//Oppgave 5
		//Du skal lage et program som leser inn tre heltall fra brukeren, og skriver ut igjen tallene sortert i stigende rekkefølge.
	   // Løs oppgaven ved bare å bruke if-setninger.
	   // Løs oppgaven ved å bruke if-else-setninger
		
		/*
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
			
			
			
			
			System.out.println("Sorterte tall i stigende rekkefølge: " + t_a + ", " + t_b + ", " + t_c);
		
		}
		*/
		
	
// Oppgave 6
	/*
	public static void main(String[] args) {
		String a = showInputDialog("Skriv inn tall inntekt: ");
		int brutto = Integer.parseInt(a);
		
		double pros1 = 0.093;
		double pros2 = 0.241;
		double pros3 = 0.1152;
		double pros4 = 0.1452;
		double trinn1 = 164100;
		double trinn2 = 230950;
		double trinn3 = 580650;
		double trinn4 = 934050;
		
//Har med "trinn_01" for å gi et bedre bilde av hva som foregår!	
		double trinn_01 = (trinn1-0);
		double trinn_12 = (trinn2-trinn1)*pros1;
		double trinn_23 = (trinn3-trinn2)*pros2;
		double trinn_34 =(trinn4-trinn3)*pros3;
		
		double differanse;
		double rest;
		double skatt;
		
		
		if (brutto <= trinn1) {
			showMessageDialog(null, "0 kr i skatt på brutto under trinn 1");
		}
			else if (brutto <= trinn2) {
				differanse = brutto - trinn1;
				rest = differanse*pros1;
				showMessageDialog(null, "skatt som skal betales: " + rest + "kr");
		}
		
			else if (brutto <= trinn3) {
				differanse = brutto - trinn2;
				rest = differanse*pros2;
				skatt = rest+trinn_12;
				showMessageDialog(null, "skatt som skal betales: " + skatt + "kr");
		}
			else if (brutto <= trinn4) {
				differanse = brutto - trinn3;
				rest = differanse*pros3;
				skatt = rest + trinn_12 + trinn_23;
				showMessageDialog(null, "skatt som skal betales: " + skatt + "kr");
		}
		else {
			differanse = brutto - trinn4;
			rest = differanse*pros4;
			skatt = rest + trinn_12 + trinn_23 + trinn_34;
			showMessageDialog(null, "Du skal betale " + skatt + "kr i skatt");
		}	
	}
	*/
	
//Oppgave 7
//Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, 
//og finn og skriv ut den karakteren A-F dette tilsvarer. Grenser for de ulike karakterene skal være:
//b)
//Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren (eller feilmelding) etter hver //innlesing. HINT: hvordan kan du bruke en for-løkke til dette.
	/*
	public static void main(String[] args) {
		int studenter = 10;
		for (int i=1; i <= studenter; i++) {
		String s = showInputDialog("Poengsum, student: " + i);
		int score = Integer.parseInt(s);
		
		
		int maks = 100;
		int a = 90;
		int b = 80;
		int c = 60;
		int d = 50;
		int e = 40;
		int f = 0;
		
		
		
		
		if (score >= a && score <= maks) {
			showMessageDialog(null,"Karakter A");
		}
			else if (score >= b && score < a) {
			showMessageDialog(null,"Karakter B");
		}
			else if (score >= c && score < b) {
			showMessageDialog(null,"Karakter C");
			}
			else if (score >= d && score < c) {
			showMessageDialog(null,"Karakter D");
			}
			else if (score >= e && score < d) {
			showMessageDialog(null,"Karakter E");
			}
			else if (score < e && score > f) {
			showMessageDialog(null, "Karakter F");
			}
		else {
			showMessageDialog(null,"Feil verdi, utenfor definsjonsområdet");
			i--;
		}
		
	}
	
	}
	*/
	
	
	
	
}
