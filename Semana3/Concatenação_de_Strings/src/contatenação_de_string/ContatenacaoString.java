package contatenação_de_string;

import java.util.Scanner;

public class ContatenacaoString {
	public static String contatenacao(String a, String b ) {
		return a + b;

	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = "Leane";
		String b = "Kay";
		
		System.out.println("O resultado é: " + contatenacao(a, b));
		scanner.close();

	}

}
