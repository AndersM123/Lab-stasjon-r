
import static javax.swing.JOptionPane.*;
import static java.lang.ArithmeticException.*;

public class Oppgaver_kapittel_3 {


//Oppgave 1
	/*
	public static void main(String[] args) {
		String tall_a = showInputDialog("Skriv inn tall nummer 1 her: ");
		String tall_b = showInputDialog("Skriv inn tall nummer 2 her: ");
		
		int a = Integer.parseInt(tall_a);
		int b = Integer.parseInt(tall_b);
		
		if (b > 0) {
			showMessageDialog(null, "Resulatet av divisjonen a/b= " + a/b);
			
		}
		else  {
			showMessageDialog(null, "Error, tallet du oppga er ikke større enn 0!");
			
		}
		

	}
	*/

	//Oppgave 2
	/*//Ikke ferdig....
	public static void main(String[] args) {
		String tall_a = showInputDialog("Tall 1");
		String tall_b = showInputDialog("Tall 2");
		String tall_c = showInputDialog("Tall 3");
		
		int a = Integer.parseInt(tall_a);
		int b = Integer.parseInt(tall_b);
		int c = Integer.parseInt(tall_c);
		
	//minste tallet
		if (a >= b && b >= c) {
			showMessageDialog(null, " tall nummer 1: " + a + "tall nummer 2: " + b + "tall nummer 3: " + c );
		}
		else if (c >= a && a >= b) {
			showMessageDialog(null, " tall nummer 1: " + c + "tall nummer 2: " + a + "tall nummer 3: " + b );
		}
		else if (b >= c && c >= a) {
			showMessageDialog(null, " tall nummer 1: " + b + "tall nummer 2: " + c + "tall nummer 3: " + a );
			
		
			}	
}
*/

	public static void main(String[] args) {

		int i = 5;
		int j = 10;
		String s = "dat100";
		boolean b = true;

		System.out.println(i * j + i);
		System.out.println(b && i > 5);
		System.out.println(!b || j == 10);
		System.out.println(s.substring(3, 5));
	}
	
	
}