package verificacao_paridade;

import java.util.Scanner;

public class VerificacaoParidade {
	public static boolean paridade (int x) {
		if(x %2==0) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero: ");
        int x = scanner.nextInt();
		if(paridade(x)) {
			System.out.print("O numero eh par ");
		}else {
			System.out.print("O numero eh impar ");
		}
			
		}
}
