import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // tamanho do vetor.
        String[] caracteres = new String[10];
        int consoantes = 0;

        for (int i = 0; i < caracteres.length; i++) { 
           System.out.println("Digite o " + (i + 1) + "º caractere: ");
           caracteres[i] = input.nextLine(); 
        }
        System.out.println("Consoantes lidas:");
        for (int i = 0; i < caracteres.length; i++) {
            String c = caracteres[i].toLowerCase();
            char primeiroCaractere = c.charAt(0);
            if (primeiroCaractere >= 'a' && primeiroCaractere <= 'z' && primeiroCaractere != 'a' && primeiroCaractere != 'e' && primeiroCaractere != 'i' && primeiroCaractere != 'o' && primeiroCaractere != 'u') {
                consoantes++;
                System.out.println(caracteres[i]);
            }
        }

        System.out.println("Total de consoantes lidas: " + consoantes);

        input.close();

    }
}