import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Em ordem crescente: ");

        if (num1 > num2) {
            System.out.println(num2 + "\n" + num1);
        } else {
            System.out.println(num1 + "\n" + num2);
        }
        scan.close();
    }
}
