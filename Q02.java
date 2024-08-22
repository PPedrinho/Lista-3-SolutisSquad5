import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario");
        double salario = scanner.nextDouble();

        System.out.println("Digite o salario minimo atual");
        double salarioMinimo = scanner.nextDouble();

        double salariosMinimos = salario / salarioMinimo;

        System.out.printf("Você ganha aproximadamente %.2f salários mínimos.%n", salariosMinimos);
        scanner.close();

    }
}
