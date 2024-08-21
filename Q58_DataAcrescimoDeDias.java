/*
58.	Leia uma data e uma quantidade de dias, em seguida exiba esta data somada pela quantidade
de dias fornecida. Exemplo: 29/04/2007 + 3 = 02/05/2007.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q58_DataAcrescimoDeDias {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definindo o formato da data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Lendo a data
            System.out.print("Digite uma data (dd/MM/yyyy): ");
            String inputDate = scanner.nextLine();

            // Convertendo a data de string para LocalDate
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Lendo a quantidade de dias
            System.out.print("Digite a quantidade de dias: ");
            int daysToAdd = scanner.nextInt();

            // Somando os dias à data
            LocalDate newDate = date.plusDays(daysToAdd);

            // Exibindo a nova data formatada
            System.out.println("A nova data é: " + newDate.format(formatter));
        }
}
