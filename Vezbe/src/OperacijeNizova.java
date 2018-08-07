import java.util.Scanner;

public class OperacijeNizova {
	static Scanner sc = new Scanner(System.in);

	// sada pravimo metod za ispisiNiz
	public static void ispisiNiz(String niz[]) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
			// OVO MOZE DA MENJA PROLAZ KROZ PETLJU
			// for (String s : niz) {
			// System.out.println(s);
		}
	}

	// Metod koji prima niz Stringova i vraca novi niz koji se sastoji od svakog
	// drugog elementa
	// public static String[] svakiDrugi(String niz[]) {
	// String niz2[] = new String[(niz.length + 1) / 2];
	// for (int i = 0; i < niz.length; i +=2) {
	// int i2 = i / 2;
	// niz2 [i2] = niz [i];
	// }
	// return niz2;
	// }

	// obrnuti niz ( OD DECEMBRA DO JANUARA) OVO ZA DOMACI
	// public static void ispisiNiz(String niz[]) {

	// public static String[] obrnutiNiz(String niz[]) {
	// String obrnuti[] = new String[niz.length];
	// int k = 0;
	// for (int i = niz.length - 1; i >= 0; i--) {
	// obrnuti [k] = niz [i];
	// k++;
	// }
	// return obrnuti;
	// }

	// I OVO ZA DOMACI
	// Metod za transformaciju nizova koji vraæa novi niz koji se sastoji samo od
	// meseci - stringova koji sadrže slovo "r"

	public static String[] izdvajaNiz(String niz[]) {
		int brEl = 0;
		for (String m : niz) {
			if (m.contains("r")) {
				brEl++;
			}
		}

		String izdvaja[] = new String[brEl];
		// String izdvaja[] = new String[niz.length];
		int i = 0;
		for (String m : niz) {
			if (m.contains("r")) {
				izdvaja[i] = m;
				i++;
			}
		}
		return izdvaja;
	}
//ISPISI SVE STRINGOVE U JEDAN STRING
	// public static String nadovezi(String niz[]) {
	// String rez = "";
	//// for (int i = 0; i < niz.length; i++) {
	//// rez = rez + niz[i];
	// for (String element : niz) {
	// rez = rez + element;
	// }
	// return rez;
	// }
	//ISPISI SVE STRINGOVE U JEDAN STRING
	public static String nadovezi(String niz[]) {
		StringBuilder rez = new StringBuilder();
		for (String element : niz) {
			rez.append(element);
		}
		return rez.toString();
	}
	

	public static void main(String[] args) {
		String meseci[] = { "januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust", "septembar", "oktobar",
				"novembar", "decembar" };
		// prva vezba ispisuje sve mesece
		// for (int i = 0; i < meseci.length; i++) {
		// System.out.println(meseci[i]);
		// druga vezba ispisuje svaki drugi mesec
		// for (int i = 0; i < meseci.length; i= i + 2) {
		// System.out.println(meseci[i]);
		// treca vezba ispisuje mesece unazad
		// for (int i = 11; i >= 0; i--) {
		// System.out.println(meseci[i]);

		// ispisiNiz(meseci);
		// ispisiNiz(svakiDrugi(meseci));
		// ispisiNiz(obrnutiNiz(meseci));

		ispisiNiz(izdvajaNiz(meseci));
		System.out.print(nadovezi(meseci));

	}
}
