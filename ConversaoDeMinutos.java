import java.util.Scanner;
public class AreaDoRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo em minutos: ");
        int minutosTotais = scanner.nextInt();

        int horas = minutosTotais/ 60;
        int minutosRestantes = minutosTotais % 60;

         System.out.printf("%d minutos equivalem a %d hora(s) e %d minuto(s).%n", 
                          minutosTotais, horas, minutosRestantes);

        scanner.close();
    }
}