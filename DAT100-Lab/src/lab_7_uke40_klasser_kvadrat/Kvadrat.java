package lab_7_uke40_klasser_kvadrat;

//Oppg.1

public class Kvadrat {

	private int sidelengde;
	
	
	public Kvadrat(int sidelengde) {
		this.sidelengde=sidelengde;
	}


	public int getSidelengde() {
		return sidelengde;
	}


	public void setSidelengde(int sidelengde) {
		this.sidelengde = sidelengde;
	}
	
	
	public void skrivUt() {
		for (int i=0; i < sidelengde; i++) {
			for (int j=0; j < sidelengde; j++) { //Uten den ekstra for løkken blirdet ikke printet et kvadrat, men bare 1 linje med stjerner
			System.out.print("* ");
			
		}
		System.out.println();
		}
	}
	
	
	public int areal() {
		return sidelengde*sidelengde;
	}
	
	public int omkrets() {
		return sidelengde*4;
	}
	
	public double diagonal() {
		return Math.sqrt(2)*sidelengde;
	}


	
		
}
	
	
	
	



