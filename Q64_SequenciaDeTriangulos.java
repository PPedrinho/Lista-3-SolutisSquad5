/*
64.	Desenhe a seguinte seqüência de triângulos. O usuário determina a quantidade de triângulos.
*

*
**

*
**
***

*
**
***
****

*
**
***
****
*****

*
**
***
****
*****
******

*
**
***
****
*****
******
*******

 */

import java.util.Scanner;

public class Q64_SequenciaDeTriangulos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++){
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
