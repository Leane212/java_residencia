package manipulaArrey;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

    public static int[] ArrayUsuario(int tamanho) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        return array;
    }

    public static int[] ArrayAleatorio(int tamanho, int limite) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(limite);
        }

        return array;
    }

    public static int calcularSomaArray(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        int tamanhoArray = 5;
        int limiteNumeros = 100;

        int[] arrayUsuario = ArrayUsuario(tamanhoArray);
        System.out.println("Array lido do usuário:");
        System.out.println(Arrays.toString(arrayUsuario));

        int[] arrayAleatorio = ArrayAleatorio(tamanhoArray, limiteNumeros);
        System.out.println("Array aleatório:");
        System.out.println(Arrays.toString(arrayAleatorio));

        int soma = calcularSomaArray(arrayUsuario);
        System.out.println("Soma dos elementos do array lido do usuário: " + soma);

        int somaA = calcularSomaArray(arrayAleatorio);
        System.out.println("Soma dos elementos do array aleatório: " + somaA);

        int maiorValor = encontrarMaiorValor(arrayUsuario);
        System.out.println("Maior valor do array lido do usuário: " + maiorValor);

        int maiorValorA = encontrarMaiorValor(arrayAleatorio);
        System.out.println("Maior valor do array aleatório: " + maiorValorA);

        int menorValor = encontrarMenorValor(arrayUsuario);
        System.out.println("Menor valor do array lido do usuário: " + menorValor);

        int menorValorA = encontrarMenorValor(arrayAleatorio);
        System.out.println("Menor valor do array aleatório: " + menorValorA);
    }
}
