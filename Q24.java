import java.util.Scanner;

public class Q24 {
    public static boolean validacao(String entrada) {
        int dia = Integer.parseInt(entrada.substring(0, 2));
        int mes = Integer.parseInt(entrada.substring(3, 5));
        int ano = Integer.parseInt(entrada.substring(6, 10));
        System.out.println(dia + "/" + mes + "/" + ano);
        if (mes < 1 || mes > 12)
            return false;
        if (dia < 1 || dia > 31)
            return false;
        if (mes == 2) {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
                if (dia > 29) return false;
            } else {
                if (dia > 28) return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            if (dia > 30) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um data no formato dd/mm/yyyy: ");
        String entrada = sc.nextLine();
        if (validacao(entrada))
            System.out.println("Data válida!");
        else
            System.out.println("Data inválida!");
        sc.close();
    }
}
