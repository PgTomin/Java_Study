import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num_1 = sc.nextInt();
			int num_2 = sc.nextInt();
			
			if(num_1 > 0 && num_2 > 0 ) {
				System.out.println( num_1 + num_2 );
			} else {
				break;
			}
		}
	}
}