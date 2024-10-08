import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de homens na turma: ");
        int quantidadeHomens = scanner.nextInt();

        System.out.print("Digite a quantidade de mulheres na turma: ");
        int quantidadeMulheres = scanner.nextInt();
        int totalAlunos = quantidadeHomens + quantidadeMulheres;

        double percentualHomens = (double) quantidadeHomens / totalAlunos * 100;
        double percentualMulheres = (double) quantidadeMulheres / totalAlunos * 100;


        System.out.printf("Percentual de homens: %.2f%%%n", percentualHomens);
        System.out.printf("Percentual de mulheres: %.2f%%%n", percentualMulheres);

        scanner.close();
    }
}
