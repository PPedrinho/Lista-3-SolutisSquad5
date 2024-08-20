import java.time.LocalDate;
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de uma pessoa: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite a data de aniversário dessa pessoa (no formato dd/mm): ");
        String [] entrada = sc.nextLine().split("/");
        LocalDate data1 = LocalDate.of(2024, Integer.parseInt(entrada[1]), Integer.parseInt(entrada[0]));

        System.out.println("Digite o nome de outra pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite a data de aniversário dessa pessoa (no formato dd/mm): ");
        entrada = sc.nextLine().split("/");
        LocalDate data2 = LocalDate.of(2024, Integer.parseInt(entrada[1]), Integer.parseInt(entrada[0]));

        System.out.println("Primeiro aniversariante: " +  (data1.isBefore(data2) ? nome1 : nome2));
        sc.close();
    }
}
