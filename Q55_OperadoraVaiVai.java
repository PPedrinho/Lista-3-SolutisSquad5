/*
55.	A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite 100 minutos
por mês para qualquer número. Além disso, ela oferece 50 minutos a mais para ligações destinadas a um
número da própria Vai-Vai. Ainda neste plano ela tem uma promoção onde cada minuto gasto para telefone
fixo consome somente a metade. O valor do minuto excedente para outras operadoras é de 0.65, e para a
própria Vai-Vai é 0.20.

Faça um programa que permita ao usuário entrar com o tipo de ligação
(‘o’ = outras operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e  a quantidade de minutos.

A cada entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar.
Faça isto enquanto ele indicar que existem mais ligações a serem digitadas.

 */

import java.util.Scanner;

public class Q55_OperadoraVaiVai {
    static int minutosOutrasOperadoras = 100;
    static int minutosVaiVai = 50;
    static int minutosExtrasOutrasOperadoras = 0;
    static int minutosExtrasVaiVai = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){

            try{
                printSaldoEValorAPagar();

                String comando = ui(scanner);
                if(comandoEValido(comando)){
                    if(comando.equals("fim")){
                        break;
                    }

                    System.out.println("Insira a quantidade de minutos gastos");
                    int minutos = Integer.parseInt(scanner.nextLine());

                    //minuto >= 0;
                    if(minutoEValido(minutos)){
                        ligacao(comando, minutos);
                    }

                }

            } catch (Exception e){
                System.out.println("Número Ou comando Inválido.");
            }

            System.out.println();
        }

        printSaldoEValorAPagar();
        scanner.close()
    }


    public static String ui(Scanner scanner){
        System.out.println("‘o’ = outras operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e  a quantidade de minutos. \n 'fim' finaliza");
        return scanner.nextLine();
    }

    public static void ligacao(String comando, int minutos) throws Exception{
        int minutosRestantes = minutos;

        //se for telefone fixo, conta metade dos minutos
        if(comando.equals("f")){
            minutosRestantes = minutosRestantes / 2;
        }

        //numero Vai-Vai
        if(comando.equals("v")){
            if(minutos > minutosVaiVai){
                minutosRestantes -= minutosVaiVai;
                minutosVaiVai = 0;
            } else{
                minutosVaiVai -= minutosRestantes;
                return;
            }

            if(minutosRestantes > minutosOutrasOperadoras){
                minutosRestantes -= minutosOutrasOperadoras;
                minutosOutrasOperadoras = 0;

                minutosExtrasVaiVai =+ minutosRestantes;
            } else{
                minutosOutrasOperadoras -= minutosRestantes;
                return;
            }

        }

        //outras operadoras
        if(comando.equals("o") || comando.equals("f")){
            if(minutosRestantes > minutosOutrasOperadoras){

                minutosRestantes -= minutosOutrasOperadoras;
                minutosOutrasOperadoras = 0;

                minutosExtrasOutrasOperadoras += minutosRestantes;
            } else{
                minutosOutrasOperadoras -= minutosRestantes;
            }

        }

    }

    public static void printSaldoEValorAPagar(){
        System.out.println("SALDO");
        System.out.println("Outras Operadoras: " + minutosOutrasOperadoras + " minutos restantes");
        System.out.println("Bônus Vai-Vai: " + minutosVaiVai + " minutos restantes");
        System.out.println("------------------");

        if(minutosExtrasVaiVai > 0 || minutosExtrasOutrasOperadoras > 0){
            printMinExtras();
        }

        System.out.println("Valor a pagar: " + ValorAPagar() + "\n");
    }

    public static void printMinExtras(){
        System.out.println("Minutos Extras Outras Operadoras: " + minutosExtrasOutrasOperadoras);
        System.out.println("Minutos Extras Vai-Vai: " + minutosExtrasVaiVai);
    }

    public static double ValorAPagar(){
        double mensal = 50.0;
        double valorOutrasOperadoras = 0.65;
        double valorVaiVai = 0.20;

         return mensal + minutosExtrasOutrasOperadoras * valorOutrasOperadoras + (minutosExtrasVaiVai * valorVaiVai);
    }

    //checagens
    public static boolean comandoEValido(String comando) throws Exception {
        if(!(comando.equals("o") || comando.equals("v") || comando.equals("f") || comando.equals("fim"))){
            throw new Exception("Comando Invalido");
        }

        return true;
    }

    public static boolean minutoEValido(int minutos) throws Exception{
        if(minutos < 0){
            throw new Exception("Número Inválido");
        }

        return true;
    }
}
