import java.util.Scanner;

public class Q17 {
    public static void signo(int dia, int mes){
        if (mes == 1){
            if (dia <= 20){
                System.out.println("Capricornio");
            } else {
                System.out.println("Aquario");
            }
        } else if (mes == 2){
            if (dia <= 18){
                System.out.println("Aquario");
            } else {
                System.out.println("Peixes");
            }
        } else if (mes == 3){
            if (dia <= 20){
                System.out.println("Peixes");
            } else {
                System.out.println("Aries");
            }
        } else if (mes == 4){
            if (dia <= 20){
                System.out.println("Aries");
            } else {
                System.out.println("Touro");
            }
        } else if (mes == 5){
            if (dia <= 20){
                System.out.println("Touro");
            } else {
                System.out.println("Gemeos");
            }
        } else if (mes == 6){
            if (dia <= 20){
                System.out.println("Gemeos");
            } else {
                System.out.println("Cancer");
            }
        } else if (mes == 7){
            if (dia <= 22){
                System.out.println("Cancer");
            } else {
                System.out.println("Leao");
            }
        } else if (mes == 8){
            if (dia <= 22){
                System.out.println("Leao");
            } else {
                System.out.println("Virgem");
            }
        } else if (mes == 9) {
            if (dia <= 22) {
                System.out.println("Virgem");
            } else {
                System.out.println("Libra");
            }
        } else if (mes == 10) {
            if (dia <= 22) {
                System.out.println("Libra");
            } else {
                System.out.println("Escorpiao");
            }
        } else if (mes == 11) {
            if (dia <= 21) {
                System.out.println("Escorpiao");
            } else {
                System.out.println("Sagitario");
            }
        } else if (mes == 12) {
            if (dia <= 21) {
                System.out.println("Sagitario");
            } else {
                System.out.println("Capricornio");
            }
        }
    }
    public static boolean validacao (int dia, int mes){
        if (mes < 1 || mes > 12)
            return false;
        if (dia < 1 || dia > 31)
            return false;
        if (mes == 2){
            if (dia > 28){
                return false;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if (dia > 30){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String meses [] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.println("Digite um data de aniversário (no formato dd/mm):");
        String entrada = sc.nextLine();
        int dia = Integer.parseInt(entrada.substring(0, 2));
        int mes = Integer.parseInt(entrada.substring(3, 5));
        boolean valido = validacao(dia, mes);
        System.out.println(valido ? "Data válida" : "Data inválida");
        if (valido){
            System.out.println("Nome do mês: " + meses[mes - 1]);
            if ((double) mes / 3 > 3){
                System.out.println("4º trimestre");
            } else if ((double) mes / 3 > 2){
                System.out.println("3º trimestre");
            } else if ((double) mes / 3 > 1){
                System.out.println("2º trimestre");
            } else {
                System.out.println("1º trimestre");
            }
            System.out.print("Signo: ");
            signo(dia, mes);
        }
        sc.close();
    }
}
