package lab_7_uke40_klasser_oppg2;

public class Konto {
	
		private int kontonummer;
		private int saldo;
		
	
		public Konto(int kontonummer, int saldo) {
			this.kontonummer=kontonummer;
			this.saldo=saldo;
		}
		
		public int getKontonr() {
			return kontonummer;
		}
		
		public void setKontonr(int kontonummer) {
			this.kontonummer=kontonummer;
		}
		
		public int getSaldo() {
			return saldo;
		}
		
		public void setSaldo(int saldo) {
			this.saldo=saldo;
		}
		
		public void uttak(int sum ) {
			if (sum > getSaldo()) {
				System.out.println("Nåværende saldo: " + getSaldo() + "Uttak ikke mulig, summen er for stor");
			} else {
				setSaldo(getSaldo()-sum);
				System.out.println("Gjenstående beløp");
			}
		}
		
		public void innskudd(int sum) {
				setSaldo(getSaldo()+sum);
				System.out.println("Nåværende saldo: " + getSaldo());
				
			
		}
		
		public String toString() {
			return "Kontonr: " + kontonummer + " Saldo: " + saldo;
		}
		
}
