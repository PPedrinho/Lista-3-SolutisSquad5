/*
53.	Exiba a tabuada de um número fornecido pelo usuário.
Por exemplo se ele digitar o número 5, então será mostrado:
5	x	1	=	5
5	x	2	=	10
5	x	3	=	15
5	x	4	=	20
5	x	5	=	25
5	x	6	=	30
5	x	7	=	35
5	x	8	=	40
5	x	9	=	45
5	x	10	=	50

 */

import java.util.Scanner;

public class Q53_Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <= 10; i++){

            //formatar na ultima linha
            if(i == 10){
                System.out.println(numero + "   x   " + i + "  =   " + numero * i);
                break;
            }

            System.out.println(numero + "   x   " + i + "   =   " + numero * i);
        }

        scanner.close();
    }
}
