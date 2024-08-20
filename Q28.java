package Lista3;

import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        if (a > c) {
            int aux = a;
            a = c;
            c = aux;
        }

        if (b > c) {
            int aux = b;
            b = c;
            c = aux;
        }

        System.out.println("Números em ordem crescente: " + a + ", " + b + ", " + c);
    }
}