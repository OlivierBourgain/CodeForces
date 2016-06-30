package p07x;
import java.util.Scanner;

public class Main71A {
	public static void main(String[] args) {
		// Use the Scanner class
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.nextLine();
		for(int i = 0; i<n;i++) {
			String s = sc.nextLine();
			System.out.println(go(s));
		}
		sc.close();
	}

	private static String go(String s) {
		if(s.length()<=10) return s;
		String res = ""+ s.charAt(0);
		res+= s.length()-2;
		res+= s.charAt(s.length()-1);
		return res;
	}
}