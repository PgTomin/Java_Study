import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			
			for(int i = 1; i <= num ; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.print("Case #" + i + ": " + a + " + " + b + " = " );
				System.out.println(a + b);
			}
		}
	}
}