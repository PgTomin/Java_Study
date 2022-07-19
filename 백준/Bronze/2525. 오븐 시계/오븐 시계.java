import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int hour = (m + n)/60;
		int min = (m + n)%60;
		
		if((m + n) >= 60) {
			if(h >= 23) {
				if(h == 0) {
					h = 0;
					System.out.print(h);
					System.out.print(" ");
					System.out.print(min);
				} else {
					hour = hour -1;
					System.out.print(hour);
					System.out.print(" ");
					System.out.print(min);
				}
			} else if((h+ hour) >= 24) {
				System.out.print((h+ hour)-24);
				System.out.print(" ");
				System.out.print(min);
			} else {
				System.out.print(h + hour);
				System.out.print(" ");
				System.out.print(min);
			}
		} else {
			System.out.print(h);
			System.out.print(" ");
			System.out.print(m + n);
		}
	}
}