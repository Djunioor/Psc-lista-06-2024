import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor = 5;
        int[] numeros = new int[vetor];

     
        for (int i = 0; i < vetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = input.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetor; i++) {
            soma += numeros[i];
        }

        int multiplicacao = 1;
        for (int i = 0; i < vetor; i++) {
            multiplicacao  *= numeros[i];
        }

    
        System.out.println("Números digitados pelo usuario:");
        for (int i = 0; i < vetor; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); 
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        input.close();
    }
}
    

