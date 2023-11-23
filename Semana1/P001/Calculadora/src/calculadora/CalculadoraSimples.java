package calculadora;
import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int escolha;
	        boolean sair = false; 

	        do {
	            System.out.println("Agora Escolha a Operacao Que Deseja: ");
	            System.out.println("1 - Adição");
	            System.out.println("2 - Subtração");
	            System.out.println("3 - Multiplicação");
	            System.out.println("4 - Divisão");
	            System.out.println("0 - Sair");
	            escolha = scanner.nextInt();

	            if (escolha >= 1 && escolha <= 4) {
	                System.out.print("Informe o Primeiro numero: ");
	                double x = scanner.nextDouble();
	                System.out.print("Informe o Segundo Numero: ");
	                double y = scanner.nextDouble();

	                double resultado = 0;

	                switch (escolha) {
	                    case 1:
	                        resultado = x + y;
	                        break;
	                    case 2:
	                        resultado = x - y;
	                        break;
	                    case 3:
	                        resultado = x * y;
	                        break;
	                    case 4:
	                        if (y != 0) {
	                            resultado = x / y;
	                        } else {
	                            System.out.println("Erro: Divisão por zero não é permitida!");
	                            continue; 
	                        }
	                        break;
	                }

	                System.out.println("O resultado da operação é: " + resultado);
	            } else if (escolha == 0) {
	                sair = true; 
	            } else {
	                System.out.println("Opção inválida!");
	            }

	        } while (!sair);

	        System.out.println("Programa encerrado.");
	        scanner.close();
	    }
}

