package Lista3;

import java.util.Scanner;
public class Q36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Números impares de " + num2 + " a " + num1 + ":");
            for(int i = num2; i <= num1; i++) {
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Números impares de " + num1 + " a " + num2 + ":");
            for(int i = num1; i <= num2; i++) {
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
