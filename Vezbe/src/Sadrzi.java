import java.util.Scanner;

public class Sadrzi {
	static Scanner sc = new Scanner(System.in);

	public static boolean sadrzi(String niz[], String str) {
		boolean nadjen = false;
		for (String s : niz) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String meseci[] = { "januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust", "septembar", "oktobar",
				"novembar", "decembar" };

		System.out.print(sadrzi(meseci, "februar"));

	}
}
