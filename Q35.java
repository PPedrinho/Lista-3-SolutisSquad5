package Lista3;

import java.util.Scanner;
import java.util.Random;
public class Q35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Informe a quantidade de números que quer sortear: ");
        int num = scanner.nextInt();
        System.out.println("Informe qual valor maximo do sorteio: ");
        int max = scanner.nextInt();
        System.out.println("Numeros sorteados: ");
        for (int i = 0; i < num; i++) {
            System.out.println(random.nextInt(max) + 1);
        }
    }
}
