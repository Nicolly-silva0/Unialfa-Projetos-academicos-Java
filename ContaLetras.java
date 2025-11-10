import java.util.Scanner;

public class ContaLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê a palavra
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        // Conta o número de letras usando length()
        int quantidade = palavra.length();

        // Exibe o resultado
        System.out.println("A palavra \"" + palavra + "\" possui " + quantidade + " letras.");

        input.close();
    }
}
