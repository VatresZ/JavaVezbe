
public class FizzBuzz {
//	Domaæi iz Jave: "Problem FizzBuzz"
//	Program treba da ispiše sve brojeve od 1 do 100. 
//		Ali…kad je broj deljiv sa 3, umesto broja ispišite reè "Fizz"
//		Kad je broj deljiv sa 5, umesto broja ispišite reè "Buzz"
//		Kad je broj deljiv i sa 3 i sa 5, umesto broja ispišite reè "FizzBuzz".
//	Poèetak ispisa treba da izgleda ovako:
//		1
//		2
//		Fizz
//		4
//		Buzz
//		Fizz
//		7
//		8
	
	static String fizzBazz(int n) {
		if (n % 15 == 0) {
			return "FizzBuzz";			
		} else if (n % 5 == 0) {
			return "Buzz";
		} else if ((n % 3) == 0) {
			return "Fizz";	
		} else {
//			return "" + n;	ili
			return String.valueOf(n);			
		}
	
	}
	
	
	public static void main(String args []) {
	
		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzBazz(i));
			
		

		} 
	}
}


//Resenje preko while if i else
//public class FizzBuzz {
////	Domaæi iz Jave: "Problem FizzBuzz"
////	Program treba da ispiše sve brojeve od 1 do 100. 
////		Ali…kad je broj deljiv sa 3, umesto broja ispišite reè "Fizz"
////		Kad je broj deljiv sa 5, umesto broja ispišite reè "Buzz"
////		Kad je broj deljiv i sa 3 i sa 5, umesto broja ispišite reè "FizzBuzz".
////	Poèetak ispisa treba da izgleda ovako:
////		1
////		2
////		Fizz
////		4
////		Buzz
////		Fizz
////		7
////		8
//	
//	public static void main(String args []) {
//
// 		int i = 0;
//		while (i < 100) {
//			i++;
//			
//			if (i % 15 == 0) {
//				System.out.println("FizzBuzz");			
//			} else if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else if ((i % 3) == 0) {
//				System.out.println("Fizz");
//			} else {
//				System.out.println(i);
//		}
//	}
//}
//}

//Resenje preko switch
//public class FizzBuzz {
////	Domaæi iz Jave: "Problem FizzBuzz"
////	Program treba da ispiše sve brojeve od 1 do 100. 
////		Ali…kad je broj deljiv sa 3, umesto broja ispišite reè "Fizz"
////		Kad je broj deljiv sa 5, umesto broja ispišite reè "Buzz"
////		Kad je broj deljiv i sa 3 i sa 5, umesto broja ispišite reè "FizzBuzz".
////	Poèetak ispisa treba da izgleda ovako:
////		1
////		2
////		Fizz
////		4
////		Buzz
////		Fizz
////		7
////		8
//	
//	public static void main(String args []) {
//
//		for (int i = 1; i <= 100; i++) {
//			switch (i % 15) {
//		case 3:
//		case 6:
//		case 9:
//			System.out.println("Fizz");	
//			break;
//		
//		case 5:
//		case 10:
//			System.out.println("Buzz");	
//			break;
//		
//		case 0:
//			System.out.println("FizzBuzz");	
//			break;
//		
//		default: 
//			System.out.println(i);
//		}
//		
//		}
//}
//}