import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] vetorNumeros = {1, 2 ,3 ,4, 5};

        for (int contador = 0; contador <=4 ;  contador++) { 
            System.out.println(vetorNumeros[contador]);
        }
   input.close();
    } 
}