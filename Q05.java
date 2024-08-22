import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int quantidadeMeses = scanner.nextInt();

        System.out.print("Digite a taxa de juros mensais (em %): ");
        double taxaJuros = scanner.nextDouble();

        double valorFinal = valorInicial + (valorInicial * (taxaJuros / 100) * quantidadeMeses);

        System.out.printf("O valor final da dívida é: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
