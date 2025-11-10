import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

       if (numero > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }


        scanner.close();
    }
}