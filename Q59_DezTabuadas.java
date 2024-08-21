/*
59.	Exiba as 10 tabuadas (de 1 a 10).
 */

public class Q59_DezTabuadas {
    public static void main(String[] args){
        int numero;

        for (int i = 1 ; i <= 10; i++){
            numero = i;

            for (int j = 1; j <= 10; j++){

                //formatar na ultima linha
                if(j == 10){
                    System.out.println(numero + "   x   " + j + "  =   " + numero * j);
                } else{
                    System.out.println(numero + "   x   " + j + "   =   " + numero * j);
                }
            }

            System.out.println("\n");
        }

    }
}
