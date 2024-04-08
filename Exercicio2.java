import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int contador = 9; contador >= 0; contador--) {
            System.out.println(vetorNumeros[contador]); 
    }
    input.close();
    }
}