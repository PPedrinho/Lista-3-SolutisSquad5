package Lista3;

import java.util.Scanner;
public class Q26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um horário:");
        int horario = scan.nextInt();
        System.out.println("Digite os minutos:");
        int minutos = scan.nextInt();
        System.out.println("Primeiro horário: " + horario + ":" + minutos);

        System.out.println("Digite outro horário:");
        int horario2 = scan.nextInt();
        System.out.println("Digite os minutos:");
        int minutos2 = scan.nextInt();
        System.out.println("Segundo horário: " + horario2 + ":" + minutos2);

        int segundos1 = (horario * 3600) + (minutos * 60);
        int segundos2 = (horario2 * 3600) + (minutos2 * 60);

        if(segundos1 > segundos2){ 
            System.out.println("A diferença entre os horários é de " + (segundos1 - segundos2) + " segundos");
        }
        else if(segundos1 < segundos2){
            System.out.println("A diferença entre os horários é de " + (segundos2 - segundos1) + " segundos");
        }
        else{
            System.out.println("Os horários são iguais");
        }


    }
}
