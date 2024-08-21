/*
60.	Apresente uma tabela contendo a evolução do valor de uma dívida ao longo dos meses e anos a partir de janeiro de 2007.
Solicite o valor da dívida, a taxa de correção e a quantidade de anos.

Por exemplo, para uma dívida de R$ 100,00 ao longo de 2 anos e com uma taxa de correção de 1.8 % ao mês:
Anos	Jan	    Fev	    Mar	    Abr	    Mai	    Jun	    Jul	    Ago	    Set	    Out	    Nov	    Dez
2007	100,00 	101,80 	103,63 	105,50 	107,40 	109,33 	111,30 	113,30 	115,34 	117,42 	119,53 	121,68
2008	123,87 	126,10 	128,37 	130,68 	133,03 	135,43 	137,87 	140,35 	142,87 	145,45 	148,06 	150,73

 */

import java.util.Scanner;

public class Q60_TabelaEvolucaoDeDivida {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados de entrada
        System.out.print("Digite o valor inicial da dívida: R$ ");
        double divida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção mensal (em %): ");
        double taxaCorrecao = scanner.nextDouble() / 100;

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        // Cabeçalho da tabela
        System.out.println("\nAnos\tJan\t    Fev\t    Mar\t    Abr\t    Mai\t    Jun\t    Jul\t    Ago\t    Set\t    Out\t    Nov\t    Dez");

        // Loop para calcular e mostrar a dívida mês a mês
        for (int ano = 2007; ano < 2007 + anos; ano++) {
            System.out.print(ano + "\t");

            for (int mes = 1; mes <= 12; mes++) {
                // Calcular o valor da dívida para o mês atual
                System.out.printf("%.2f\t", divida);

                // Atualizar o valor da dívida aplicando a taxa de correção
                divida += divida * taxaCorrecao;
            }
            System.out.println(); // Quebra de linha para o próximo ano
        }

        scanner.close();
    }
}
