import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // tamanho do vetor.

        double[] notas = new double[4];
        double soma = 0;

        // Dados das notas.
        
        for (int i = 0; i < notas.length; i++) { 
            System.out.println("Digite a nota: " + (i + 1));
            notas[i] = input.nextDouble();
            soma += notas[i];
        }
        
        // media das notas;
        double media = soma / notas.length;

        // Escrevendo as notas

        System.out.println("Notas do aluno são ");
        for (int i = 0; i< notas.length; i++){
            System.out.println("Notas " + (i + 1) + ": " + notas[i]);
        }

        //  Media das notas na tela.

        System.out.println("A media das notas è: " + media);

        input.close();

    }
}

        

