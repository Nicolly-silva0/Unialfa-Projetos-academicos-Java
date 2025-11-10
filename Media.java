import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int n3 = scanner.nextInt();

        int media = (n1 + n2 + n3)/3;

        System.out.println("A média das três notas é: "+media);

        scanner.close();
    }
}