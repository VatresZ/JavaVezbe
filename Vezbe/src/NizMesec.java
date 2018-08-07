import java.util.Scanner;
public class NizMesec {
	static Scanner sc = new Scanner(System.in);

// Ispisati sva imena meseci koja sadrze slovo R koristeci metod contains i naprednu for metodu		
		
	public static void main (String [] args) {
	String meseci [] = {
		    "januar",
		    "februar",
		    "mart",
		    "april",
		    "maj",
		    "jun",
		    "jul",
		    "avgust",
		    "septembar",
		    "oktobar",
		    "novembar",
		    "decembar" };
	
for (String imeMeseca : meseci) {
if (imeMeseca.contains("r")) {		
System.out.println(imeMeseca);
	}		
}
	}	
}