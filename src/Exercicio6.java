import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAlunos = 10;
        double[] media = new double[numAlunos];
        double nota;
        int aprovados = 0;

        for(int i = 0; i < numAlunos; i++) {
            double somaNotas = 0;
            System.out.println("Aluno N: " + (i + 1));

            for (int j = 0; j < 4; j++) { 
                System.out.println("Digite a nota do Aluno: " + (j + 1));
                nota = input.nextDouble();
                somaNotas += nota;
            }
            media[i] = somaNotas / 4; 
        }
            for (int i = 0; i < numAlunos; i++) {
            if (media[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + aprovados);

        input.close();
    }
    
}
