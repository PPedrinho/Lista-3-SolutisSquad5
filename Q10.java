import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor dos descontos: R$ ");
        double descontos = scanner.nextDouble();

        System.out.print("Digite o valor do empréstimo solicitado: R$ ");
        double emprestimoSolicitado = scanner.nextDouble();

        double salarioLiquido = salarioBruto - descontos;
        double valorMaximoEmprestimo = salarioLiquido * 0.30;


        if (emprestimoSolicitado <= valorMaximoEmprestimo) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo não aprovado. O valor solicitado excede o limite permitido.");
        }

        scanner.close();
    }
}
