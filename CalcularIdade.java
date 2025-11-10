import java.util.Scanner;
public class CalcularIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoatual = scanner.nextInt();

        System.out.println("Qual sua data de nascimento? ");
        int ano = scanner.nextInt();

        int idade = anoatual - ano;
        System.out.println("Você tem "+idade+" anos");

        scanner.close();
    }
}