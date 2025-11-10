import java.util.Scanner;
public class SomaDeUmACem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i; 
        }

        System.out.println("A soma de todos os números de 1 a 100 é: " + soma);
            
        
        scanner.close();
    }
}