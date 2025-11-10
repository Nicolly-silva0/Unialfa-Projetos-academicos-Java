import java.util.Scanner;
public class AreaDoRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retâgulo: ");
        int base = scanner.nextInt();

        System.out.println("Digite a altura do retâgulo: ");
        int altura = scanner.nextInt();

        int resultado = base * altura;

         System.out.println("A área do retângulo é: "+resultado);

        scanner.close();
    }
}