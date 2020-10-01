package lab_7_uke40_klasser_oppg2;

import static javax.swing.JOptionPane.*;

public class Konto_test {

	public void uttak(Konto[] konto, int sum) {
		if (sum > konto[1].getSaldo()) {
			System.out.println("Nåværende saldo: " + konto[1].getSaldo() + "Uttak ikke mulig, summen er for stor");
		} else {
			konto[1].setSaldo(konto[1].getSaldo()-sum);
			System.out.println("Gjenstående beløp");
		}
	}
	
	public static void innskudd(Konto[] kontoTab,int konto, int sum) {
			kontoTab[konto].setSaldo(kontoTab[konto].getSaldo() + sum);
			System.out.println("Innskudd " + sum + "kr på konto " + konto + ". Nåværende beløp: " + kontoTab[konto].getSaldo());
			
		
	}
	
	public static void main(String[] args) {
		
		Konto[] kontoTab = new Konto[3];
		
		kontoTab[0]= new Konto(1, 6000);
		kontoTab[1]= new Konto(2, 3000);
		kontoTab[2] = new Konto(3, 1000);
		
		System.out.println("Bankoversikt: ");
		for (Konto k : kontoTab) {
			System.out.println(k.toString());
			
		}
		int k=Integer.parseInt(showInputDialog("Hvilken konto ønsker du å gjøre innskudd på?"));
		int s=Integer.parseInt(showInputDialog("Hvor mye vil du sette inn?"));
		innskudd(kontoTab, k, s);
		
	}
	
	
	
	
	
}
