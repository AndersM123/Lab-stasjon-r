
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class Skoleprøve_sep {


//Oppgave 1
	/*
//a)
	public static void main(String[] args) {
		String heltall = showInputDialog("Skriv et heltall: ");
		int a = Integer.parseInt(heltall);
		
		if (a > 0) {
			showMessageDialog(null, a + " er større enn 0!");
		}
		else if (a < 0) {
			showMessageDialog(null, a + " er mindre enn 0!");
		}
		
		else if (a == 0) {
			showMessageDialog(null, a + " er lik 0!");
		}
	}
	*/
	
//b)
	/*
	public static void main(String[] args) {
		String heltall = showInputDialog("Skriv et heltall: ");
		int a = Integer.parseInt(heltall);
		
		if (a >= 5 && a <= 8) {
			showMessageDialog(null, a + " er innenfor definisjonsområdet!");
		}
		else {
			showMessageDialog(null, a + " er utenfor definisjonsområdet!");
		}
		
	}
	*/
//c)
	/*
	public static void main(String[] args) {
		int heltall = 2;
		String heltallTxt = "";
		
		switch(heltall) {
		case 0:
		heltallTxt = "null, gyldig verdi";
		break;
		
		case 1:
		heltallTxt = "en, gyldig verdi";
		break;
		
		case 2:
		heltallTxt = "to, gyldig verdi";
		break;
		
		case 3:
		heltallTxt = "tre, gyldig verdi";
		break;
		
		case 4:
		heltallTxt = "fire, gyldig verdi";
		break;
		
		case 5:
		heltallTxt = "ugyldi verdi";
		break;
		
		default:
		heltallTxt = "Ulovlig verdi";
		}
		
		System.out.println(heltallTxt);
		}
		
	}
	*/
	
//Oppgave 2
	/*
	public static void main(String[] args) {
		
			for (int i=2; i<=6; i++) {
				System.out.println("10" + "/"+ i + "=" + 10/i);

			}	
	}
	*/

//Oppgave 3
	/*
	public static void main(String[] args) {
		
		String ukjent_tall = "Skriv inn et heltall, avslutt med 0: ";
		
		int mengdeInput = 0;
		int sumavInput = 0;
		
		int i = Integer.parseInt(showInputDialog(ukjent_tall));
		while(i != 0) {
			mengdeInput += i;
			sumavInput++;
			
			i = Integer.parseInt(showInputDialog(ukjent_tall));
		}
		System.out.println("Antall tall: " + mengdeInput);
		System.out.println("Sum av tall: " + sumavInput);
		
	}
	*/
	
//Oppgave 4
//a)
	/*
	public static void main(String[] args) {
		String tall_1 = showInputDialog("Skriv inn tall nummer 1: ");
		String tall_2 = showInputDialog("Skriv inn tall nummer 2: ");
		String tall_3 = showInputDialog("Skriv inn tall nummer 3: ");
		
		
		int a = Integer.parseInt(tall_1);
		int b = Integer.parseInt(tall_2);
		int c = Integer.parseInt(tall_3);
		
		
		int tall12 = min(a, b);
		int tall23 = min(b, c);
		int tall123 = min(tall12, tall23);
		
		showMessageDialog(null, "Det minste tallet av de fire du skrev inn er: " + tall123);
	{
	*/
	
//Oppgave 5
	/*
	public static void main(String[] args) {
	//a)
		String radius = showInputDialog("Skriv inn radius: ");
		
		double r = Double.parseDouble(radius);
		
		double ArealavSirkel = PI * r * r;
		
		showMessageDialog(null, "Arealet av sirkelen er: " + ArealavSirkel);	
		
	}
	*/
	//b)
	/*
	public static void main(String[] args) {
		double radius = 1.5;
		
		double pi = PI;
		
		System.out.print(pi*radius*radius);
		
	}
	
	*/
}

	

