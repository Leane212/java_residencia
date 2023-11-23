package numeros;
import java.util.Scanner;

public class NumerosInteiros {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Informe o Primeiro numero: ");
            int x = scanner.nextInt();
			
            System.out.print("Informe o Segundo numero: ");
            int y = scanner.nextInt();
			
            int resultado = x + y;
            
            System.out.println("O resultado da operação é: " + resultado);
			
		}
}
