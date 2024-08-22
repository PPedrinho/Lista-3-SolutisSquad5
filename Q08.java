import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();


        if (denominador != 0) {
            double numeroReal = (double) numerador / denominador;
            System.out.printf("O número real é: %.2f%n", numeroReal);
        } else {
            System.out.println("Erro: O denominador não pode ser zero!");
        }

        scanner.close();
    }
}
