package media_ponerada;

import java.util.Scanner;

public class MediaPonderada {
	
	public static float ponderada (float x,float y, float a, float pesoX, float pesoY, float pesoA) {
		return ((x * pesoX)+(y * pesoY)+(a * pesoA))/(pesoX + pesoY + pesoA);
		
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float pesoX = 3;
		float pesoY = 2;
		float pesoA = 1;
		
		System.out.print("Informe a primeira nota: ");
        float x = scanner.nextFloat();
		
        System.out.print("Informe a segunda nota: ");
        float y = scanner.nextInt();
        
        System.out.print("Informe a segunda nota: ");
        int a = scanner.nextInt();
        
        System.out.println("A media ponderada é: " + ponderada(x, y, a, pesoX, pesoY, pesoA));
		scanner.close();
        

	}

}
