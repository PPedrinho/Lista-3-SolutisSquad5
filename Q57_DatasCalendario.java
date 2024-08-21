/*
57.	Exiba todas as datas de um calendário que estão entre duas datas informadas
pelo usuário (dia, mês e ano). Suponha que as duas datas informadas sejam válidas.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q57_DatasCalendario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Formato de data esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Leitura das datas de início e fim
        System.out.println("Informe a data de início (dd/MM/yyyy): ");
        String dataInicioStr = scanner.nextLine();
        System.out.println("Informe a data de fim (dd/MM/yyyy): ");
        String dataFimStr = scanner.nextLine();

        // Conversão das strings para LocalDate
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatter);
        LocalDate dataFim = LocalDate.parse(dataFimStr, formatter);

        // Exibição de todas as datas entre dataInicio e dataFim
        LocalDate dataAtual = dataInicio;
        while (!dataAtual.isAfter(dataFim)) {
            System.out.println(dataAtual.format(formatter));
            dataAtual = dataAtual.plusDays(1);
        }

        scanner.close();
    }
}

