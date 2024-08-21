/*
52.	A história do rei que e tornou pobre: após perder uma aposta com um súdito, ele teve que pagar
uma quantia muito grande em sacos de arroz. A aposta feita anteriormente era que se o súdito ganhasse
o rei teria que pagar um grão de arroz colocado na primeira casa de um tabuleiro de xadrez.

Na segunda casa teria que pagar o dobro, ou seja, dois grãos de arroz, e assim sucessivamente até a
casa número 64.  Exiba quantos grãos de arroz este súdito teria que ganhar, somando todas as 64 casas.

Depois tente exibir a quantia de sacos de arroz?
 */

public class Q52_GraosDeArroz {
    public static void main(String[] args) {
        long totalGraos = 0;
        long graosCasa = 1;

        //2^63 + 1 (63 casas em exponenciação de 2 + 1 grão na primeira casa);
        for (int i = 1; i <= 64; i++) {
            totalGraos += graosCasa;
            graosCasa *= 2;
        }
        /*
        matematicamente, o resultado é: 2^63 + 1 = 9,223,372,036,854,775,808
        contudo, o número positivo máximo para um dado tipo long é de 2^63,
        ou seja, o + 1 da casa inicial causa overflow.
         */

        System.out.println("Total de grãos de arroz que o súdito deve ganhar: " + totalGraos);

        //sem alterar o overflow
        System.out.println("Total em sacos de arroz: " + totalGraos / 50000);

    }
}
