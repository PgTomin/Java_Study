import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if( 1 <= h && h <= 24) {
			if( 45 <= m && m <= 59) {
				System.out.print(h + " ");
				System.out.print(m-45);
			} else if (0 <= m && m <= 44) {
				System.out.print(h-1 + " ");
				System.out.print( 15 + m);
			}
		}
		
		if( h == 0) {
			if( 45 <= m && m <= 59) {
				System.out.print(h + " ");
				System.out.print( m -45);
			} else if( 0 <= m && m <= 44) {
				System.out.print(h + 23 + " ");
				System.out.print( m + 15);
			}
		}
	}
}