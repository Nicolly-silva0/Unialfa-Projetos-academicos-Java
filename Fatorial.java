import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Não existe fatorial de número negativo!");
        } else {
            long fatorial = 1; 

            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

            
        
        scanner.close();
    }
}