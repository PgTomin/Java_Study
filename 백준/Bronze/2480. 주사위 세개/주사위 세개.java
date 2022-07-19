import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int num = 0;
		int price = 0;
		
		if( a == b && b == c && c == a ) { // case a=b=c
			num = a;
			price = 10000 + (num * 1000);
			System.out.print(price);
			
		} else if( a == b && b != c && c != a) { // case a=b
			num = ( a + b ) / 2;
			price = 1000 + num*100;
			System.out.print(price);
		} else if ( a != b && b == c && c != a ) { // case b=c
			num = ( b + c ) / 2;
			price = 1000 + num*100;
			System.out.print(price);
		} else if ( a != b && b != c && c == a) { // case c=a
			num = ( a + c ) / 2;
			price = 1000 + num*100;
			System.out.print(price);
			
		} else if ( a != b && b != c && c != a ) { // case a != b!= c (a != c)
			if (a >= b && a >= c) { // a
				num = a;
				price = num * 100;
				System.out.print(price);
			} else if ( b >= a && b>= c) { // b
				num = b;
				price = num * 100;
				System.out.print(price);
			} else if (c >= a && c >= b) { // c
				num = c;
				price = num * 100;
				System.out.print(price);
			}
		}
	}
}