import java.util.Scanner;

public class KorenBroja {
	static Scanner sc = new Scanner(System.in);
//	5. (bonus zadatak!) Neka program ispiše kvadratni koren broja c. 
//	Ako kvadratni koren nije ceo broj, neka ispiše najbliži ceo broj manji od kvadratnog korena. 
//	Npr. ako je c=49, neka se ispiše 7; ako je c=48, neka se ispiše 6.

	   
  public static void main (String args[]) {
	  
	  System.out.println("Unesi  broj: ");
	  double c = sc.nextDouble();
	  
	  double rezultat = Math.sqrt(c);
	  int koren = (int) rezultat;	//ovde vrsimo kastovanje tj. prebacivanje iz double u int
	  
	  System.out.println("Kvadratni koren tj. najblizi broj je " + koren);

  }
}