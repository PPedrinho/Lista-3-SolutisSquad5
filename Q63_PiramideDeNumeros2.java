/*
63.	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
01
01 02
01 02 03
01 02 03 04
01 02 03 04 05
01 02 03 04 05 06
01 02 03 04 05 06 07
01 02 03 04 05 06 07 08
01 02 03 04 05 06 07 08 09
01 02 03 04 05 06 07 08 09 10
01 02 03 04 05 06 07 08 09 10 11

 */

import java.util.Scanner;

public class Q63_PiramideDeNumeros2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numeroFormatado(j) + " ");
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
