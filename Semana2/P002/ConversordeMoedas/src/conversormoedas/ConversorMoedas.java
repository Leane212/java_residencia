package conversormoedas;
import java.util.Scanner;

public class ConversorMoedas {

	public static double ConversorMoedas(double dolares, double cambio) {
		return dolares * cambio;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------Conversor de Moeda!------");
		
		System.out.print("Insira a quantidade em dólares: ");
        double dolares = scanner.nextDouble();
        System.out.print("Insira a taxa de câmbio: ");
        double cambio = scanner.nextDouble();
        
        System.out.println("O valor em reais é: " + ConversorMoedas(dolares, cambio)+ "R$");
		scanner.close();

	}

}
