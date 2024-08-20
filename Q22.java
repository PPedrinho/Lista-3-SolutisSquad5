import java.time.LocalDate;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate data1 = null, data2 = null;
        while (true) {
            try {
                System.out.println("Digite uma data (no formato dd/mm/yyyy): ");
                String entrada[] = sc.nextLine().split("/");
                data1 = LocalDate.of(Integer.parseInt(entrada[2]), Integer.parseInt(entrada[1]), Integer.parseInt(entrada[0]));
                
                System.out.println("Digite outra data (no formato dd/mm/yyyy): ");
                entrada = sc.nextLine().split("/");
                data2 = LocalDate.of(Integer.parseInt(entrada[2]), Integer.parseInt(entrada[1]), Integer.parseInt(entrada[0]));

                break;
            } catch (Exception e) {
                System.out.println("Data inválida!");
            }
        }
        sc.close();
        if (data1.isEqual(data2)) {
            System.out.println("As duas datas são iguais.");
        } else {
            System.out.println("As duas datas são diferentes.");
        }
    }
}
