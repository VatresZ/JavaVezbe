import java.util.Scanner;

public class Racunica {

  static int[] nizOdDo(int poc, int kraj) {
    int duzina = kraj - poc + 1;
    int niz[] = new int[duzina];
    for (int i = 0; i < duzina; i++) {
      niz[i] = poc + i;
    }
    return niz;
  }
  
  static int proizvodNiza(int niz[]) {
    int p = 1;// ovde treba 1
    for (int i = 0; i < niz.length; i++) {
      p = p * niz[i];
    }
    return p;
  }
  
  static int prizvodOdDo(int a, int b) { 
	  int[] niz = nizOdDo(a, b);
	  return proizvodNiza(niz);
//	  return proizvodNiza(nizOdDo(a, b));  
  }
 
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]) {
    System.out.print("Unesite dva broja: ");
    int a = sc.nextInt(), b = sc.nextInt();
    
//    int[] niz = nizOdDo(a, b);
//    int proizvod = proizvodNiza(niz);
    
    int proizvod = prizvodOdDo(a, b);
    
    		
    System.out.println("Proizvod brojeva od " + a +
      " do " + b + " je: " + proizvod);
}
}
