package jogoadivinhacao;
import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {

	public static boolean palpite(int x, int numeroGerado) {
		if(x == numeroGerado) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroGerado = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            int x = scanner.nextInt();
            tentativas++;

            if (palpite(x, numeroGerado)) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            } else if (x > numeroGerado) {
            	System.out.println("Muito alto. Tente novamente.");
            } else {
            	System.out.println("Muito baixo. Tente novamente.");
            }
        }

        scanner.close();
    }

}
