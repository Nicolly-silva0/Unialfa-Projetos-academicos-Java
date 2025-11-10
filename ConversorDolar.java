import java.util.Scanner;
public class ConversorDolar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dólares: ");
        double dolar = scanner.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        double reais = dolar * cotacao;
        System.out.printf("US$%.2f equivalem a R$%.2f%n", dolar, reais);

        scanner.close();
    }
}