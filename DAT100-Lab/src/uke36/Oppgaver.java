package uke36;

import static javax.swing.JOptionPane.*;

public class Oppgaver {

//Oppgave 1
	/*
	public static void main(String[] args) {

		int i;

	    System.out.println("Test av repetisjonssetning.");
	    System.out.println("***************************");

	    i = 1;

	    while (i <= 10) {
	      System.out.println("Dette er linje nr. " + i);

	      if (i == 4) {
	        System.out.println();
	      }

	      if (i == 8) {
	        System.out.println();
	      }

	      i = i + 1;
	    }
	  }
*/	
	
//Oppgave 3
		
//whatwhat?
	
	public static void main(String[] args) {
	String a = showInputDialog("Skriv et tall for n: ");
	double n = Double.parseDouble(a);
	String b = showInputDialog("Skriv et tall for x: ");
	double x = Double.parseDouble(b);
	
	double variabel = 1.0;
	
	while (n <= n); {
		showMessageDialog(null,variabel * Math.pow(x, n));
		n++;
	}
	
	
	
}
	}


