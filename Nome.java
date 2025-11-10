import java.util.Scanner;
public class Nome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como é seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Olá, "+nome+"!");

        scanner.close();
    }
}