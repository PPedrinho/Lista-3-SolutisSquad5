
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        String meses [] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de um mês: ");
        String entrada = sc.nextLine();
        for (int i = 0; i < meses.length; i++) {
            if (entrada.equals(meses[i])) {
                System.out.println("Número do mês: " + (i + 1));
            }
        }
        sc.close();
    }
}