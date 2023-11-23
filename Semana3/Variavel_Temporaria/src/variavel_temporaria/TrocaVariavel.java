package variavel_temporaria;

import java.util.Scanner;

public class TrocaVariavel {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 4;
		int y = 7;
		int z = x;
		
		x = y;
		y = z;
		
		System.out.println("O valores agora são (x): " + x + " (y): " + y );
	}

}
