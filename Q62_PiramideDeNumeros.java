/*
62.	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
01
02 02
03 03 03
04 04 04 04
05 05 05 05 05
06 06 06 06 06 06
07 07 07 07 07 07 07
08 08 08 08 08 08 08 08
09 09 09 09 09 09 09 09 09
10 10 10 10 10 10 10 10 10 10
11 11 11 11 11 11 11 11 11 11 11
 */

import java.util.Scanner;

public class Q62_PiramideDeNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numeroFormatado(i) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static String numeroFormatado(int numero){
        String numeroFormatado = "";

        if(numero < 10){
            numeroFormatado += "0";
        }

        return numeroFormatado + numero;
    }
}
