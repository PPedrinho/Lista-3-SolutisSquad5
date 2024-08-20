import java.util.Scanner;

public class Q16 {
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
        }
        sc.close();
    }
}
