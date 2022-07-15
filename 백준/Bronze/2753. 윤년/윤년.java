import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		score = sc.nextInt();
		sc.close();
		
		if((score % 4) == 0) {
			if((score % 100) != 0 || (score % 400) == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}
	}	
}