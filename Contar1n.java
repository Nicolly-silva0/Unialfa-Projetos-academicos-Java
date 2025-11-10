import java.util.Scanner;
public class Contar1n {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Por favor, digite um número inteiro maior ou igual a 1.");
        } else {
            System.out.println("\nNúmeros de 1 até " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }


        scanner.close();
    }
}