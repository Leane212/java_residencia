package conversor;
import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sair = true;

        while (sair) {

            
            System.out.println("Insira a temperatura que deseja converter: ");
            double temperatura = scanner.nextDouble();

            System.out.println("Insira a unidade atual da temperatura (1-Celsius ou 2-Fahrenheit): ");
            int unidadeAtual = scanner.nextInt();

            double temperaturaConvertida;
            if (unidadeAtual == 1) {
                temperaturaConvertida = (temperatura * 9 / 5) + 32;
            } else {
                temperaturaConvertida = (temperatura - 32) * 5 / 9;
            }

            
            System.out.println("A temperatura convertida é: " + temperaturaConvertida);

            
            System.out.println("Deseja continuar? (S/N)");
            String opcao = scanner.next();
            sair = opcao.equalsIgnoreCase("s");
        
    
        }

	}

}
