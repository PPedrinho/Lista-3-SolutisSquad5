import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("O aluno foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("O aluno ficou de recuperação.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

        scanner.close();
    }
}
