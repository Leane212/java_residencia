package area_retangulo;

import java.util.Scanner;

public class AreaRetangulo {
	public static int area(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor da base: ");
        int x = scanner.nextInt();
		
        System.out.print("Informe o valor da altura: ");
        int y = scanner.nextInt();
        
        System.out.println("O valor da area eh: " + area(x, y)+ "m²");
		scanner.close();
	}

}
