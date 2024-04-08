import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Criando os vetores.
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        // Lendo os numeros.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
            
            // Verifica se o número é par ou ímpar e armazena no vetor correspondente
            if (numeros[i] % 2 == 0) {
                pares[contadorPar] = numeros[i];
                contadorPar++;
            } else {
                impares[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }

        // Imprime os números pares.
        System.out.println("Números pares:");
        for (int i = 0; i < contadorPar; i++) {
            System.out.println(pares[i]);
        }

        // Imprime os números ímpares.
        System.out.println("Números ímpares:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.println(impares[i]);
        }

        input.close();
    }
}


