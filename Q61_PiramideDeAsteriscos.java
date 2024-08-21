/*
61.	Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
*
**
***
****
*****
******
*******
********
*********
**********
***********
************

 */

import java.util.Scanner;

public class Q61_PiramideDeAsteriscos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
