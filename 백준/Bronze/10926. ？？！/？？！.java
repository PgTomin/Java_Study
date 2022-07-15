import java.util.Scanner;

public class Main {

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.nextLine();
		sc.close();
		
		System.out.println(a + "??!");
	}
/*
	//When used to BufferedReader instead of Scanner
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a;
		a = br.readLine();
		
		System.out.println(a + "??!");
	}
*/
}
