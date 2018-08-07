import java.util.Scanner;
public class Krug {
	static Scanner sc = new Scanner(System.in);
	
	static double konstantaPi=3.14;
//	double poluprecnik= sc.nextDouble();
	public static double obimKruga(double poluprecnik) {
		double rezultat= poluprecnik * 2 * konstantaPi;
		return rezultat;
	}
	
	public static void main(String[] args) {
	
		
//		double poluprecnik; 
		System.out.print("Unesite poluprecnik: ");
//		poluprecnik  = sc.nextDouble();
		double poluprecnik= sc.nextDouble();
			
		double resenje = obimKruga(poluprecnik);
		
		System.out.print("Obim kruga za poluprecnik od " + poluprecnik + " iznosi "+resenje );

	
	}

}
