/*
65.	Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
...

 */

import java.util.Scanner;

public class Q65_PiramideDeAsteriscos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = Integer.parseInt(scanner.nextLine());
        int numeroDeEspacos = linhas - 1;
        int numeroDeAsteriscos = 1;

        for (int i = 1; i <= linhas; i++) {
            printEspacos(numeroDeEspacos);
            System.out.println(asteriscos(numeroDeAsteriscos));

            numeroDeEspacos--;
            numeroDeAsteriscos += 2;
        }

        scanner.close();
    }

    public static void printEspacos(int numeroDeEspacos){

        for(int i = 0; i < numeroDeEspacos; i++){
            System.out.print(" ");
        }
    }

    public static String asteriscos(int numeroDeAsteriscos){
        String asteriscos = "";

        for(int i = 0; i < numeroDeAsteriscos; i++){
            System.out.print("*");
        }

        return asteriscos;
    }

}
