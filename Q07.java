import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da despesa do cliente: R$ ");
        double valorDespesa = scanner.nextDouble();

        double comissao = valorDespesa * 0.10;


        System.out.printf("A comissão do garçom é: R$ %.2f%n", comissao);

        scanner.close();
    }
}

