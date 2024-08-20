import java.util.Scanner;

public class Q25 {
    public static boolean validacao(String horario[]) {
        int hora = Integer.parseInt(horario[0]);
        int minuto = Integer.parseInt(horario[1]);
        int segundo = Integer.parseInt(horario[2]);
        if (hora < 0 || hora > 23) return false;
        if (minuto < 0 || minuto > 59) return false;
        if (segundo < 0 || segundo > 59) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um horário (no formato hh:mm:ss): ");
        String horario[] = sc.nextLine().split(":");
        if (validacao(horario))
            System.out.println("Horário Valido");
        else
            System.out.println("Horário Invalido");
        sc.close();
    }
}
