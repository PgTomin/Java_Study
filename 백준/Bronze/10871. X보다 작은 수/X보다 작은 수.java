import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		int arr[] = new int[num_1];
		
		for (int i = 0; i < num_1; i++){
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < num_1; i++) {
			if(arr[i] < num_2) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
