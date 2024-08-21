/*
54.	Apresente uma tabela de conversão de reais em dólares. Ela deve ser totalmente configurável,
ou seja o usuário pode informar o valor inicial e final, o valor de incremento e o valor de 1 dólar.
Apresente os números no formato monetário com duas casas decimais.
 */


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Q54_ConversaoRealDolar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Configuração das entradas pelo usuário
            System.out.print("Informe o valor inicial em reais: ");
            double valorInicial = scanner.nextDouble();

            System.out.print("Informe o valor final em reais: ");
            double valorFinal = scanner.nextDouble();

            System.out.print("Informe o valor de incremento em reais: ");
            double incremento = scanner.nextDouble();

            System.out.print("Informe o valor de 1 dólar em reais: ");
            double valorDolar = scanner.nextDouble();

            // Configuração do formatador para exibir os valores no formato monetário
            NumberFormat formatoReais = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            NumberFormat formatoDolares = NumberFormat.getCurrencyInstance(Locale.US);

            // Cabeçalho da tabela
            System.out.println("\nTabela de Conversão de Reais para Dólares");
            System.out.println("=========================================");
            System.out.println("  Reais         Dólares");

            // Gerando a tabela de conversão
            for (double valorReais = valorInicial; valorReais <= valorFinal; valorReais += incremento) {
                double valorConvertido = valorReais / valorDolar;
                System.out.printf("%-15s %s%n", formatoReais.format(valorReais), formatoDolares.format(valorConvertido));
            }

            scanner.close();
        }
}
