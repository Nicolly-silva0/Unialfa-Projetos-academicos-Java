import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}