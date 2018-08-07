//	7. Napravite odvojenu klasu po imenu Tacka, koja treba da predstavlja taèku sa x i y koordinatama u ravni. 
//	Ne treba da pravite nikakve metode osim (bar jednog) konstruktora.

public class Tacka {

	int x;
	int y;
	
	Tacka(int a1, int b1){
		x=a1;
		y=b1;		
	}
	
}
//	8. Napravite odvojenu klasu po imenu Duz, koja treba da predstavlja duž u ravni, odreðenu dvema krajnjim taèkama. 
//Napišite bar jedan konstruktor. Napravite metod koji raèuna i vraæa dužinu duži. 
//(Ako niste sigurni kako se raèuna dužina duži, stavite da se vraæa bilo koja vrednost, da biste mogli da nastavite sa sledeæim zadatkom.)
//

class Duz{
	Tacka t1;
	Tacka t2;
	
	Duz (Tacka t11, Tacka t22){
		t1=t11;
		t2=t22;
	}
	
	public double vratiDuz () {
		double prvaRazlika = t1.x - t2.x;
		double drugaRazlika = t1.y - t2.y;
		double duzina =	Math.sqrt(Math.pow(prvaRazlika, 2) + Math.pow(drugaRazlika, 2));
		return duzina;		
	}
}
