
public class Grad {
// Napravi klasu Grad. 
// Napravi atribut nazivGrada sa pocetnom vrednoscu recimo x.
//Napravi atribut brojStanovnika sa pocetnom vrednoscu nula.
//U okviru klase imamo tri objekta Beograd(2mil.), Novi Sad(1mil) i Nis(nepoznat broj stanovnika).
//Na kraju ispisi vrednosti atributa svih objekata.
		
	String nazivGrada = "x";
	int brojStanovnika= 0;
			
	public static void main(String[] args) {
	
		Grad g1= new Grad();
		Grad g2= new Grad();
		Grad g3= new Grad();
		
		g1.nazivGrada="Beograd";
		g1.brojStanovnika=2000000;
		
		g2.nazivGrada="Novi Sad";
		g2.brojStanovnika=1000000;
		
		g3.nazivGrada="Niš";
	
		System.out.println("Grad "+ g1.nazivGrada + " ima "+ g1.brojStanovnika + " stanovnika.");
		System.out.println("Grad "+ g2.nazivGrada + " ima "+ g2.brojStanovnika + " stanovnika.");
		System.out.println("Grad "+ g3.nazivGrada + " ima "+ g3.brojStanovnika + " stanovnika.");
	}

}
