import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = input.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = input.nextDouble();

        if (combustivel <= 0) {
            System.out.println("O valor de combustível deve ser maior que zero!");
        } else {
            
            double consumoMedio = distancia / combustivel;

            System.out.printf("O consumo médio foi de %.2f km/l%n", consumoMedio);
        }

        input.close();
    }
}
