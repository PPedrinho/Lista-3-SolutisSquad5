/*
56.	Crie um programa para simular uma urna de votação para exatamente 3 candidatos.
Logo no início deve-se perguntar ao usuário os nomes dos candidatos.

Permita votos em branco.
Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de cada candidato.
Apresente também a quantidade e o percentual dos votos em branco e quem foi o ganhador da eleição.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q56_UrnaDeVotacao {
    static String candidato1 = "";
    static String candidato2 = "";
    static String candidato3 = "";
    static ArrayList<Integer> votos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ui(scanner);

        while (true) {
            System.out.println("\nUrna de votação" + "\n----------------------------");
            System.out.println("    Digite '1' para votar em: " + candidato1);
            System.out.println("    Digite '2' para votar em: " + candidato2);
            System.out.println("    Digite '3' para votar em: " + candidato3);
            System.out.println("    Digite '0' para votar em branco");
            System.out.println("    'fim' finaliza o programa");

            String voto = scanner.nextLine();
            if (voto.equals("fim")) {
                break;
            }

            try {
                if (eValido(voto)) {
                    votar(voto);
                    printVotos();
                }
            } catch (Exception e) {
                System.out.println("Inválido.");
            }
        }

        printVotos();
        printResultado();
    }


    public static void ui(Scanner scanner){
        for(int i = 1 ; i <= 3; i++){
            System.out.println("Nome do candidato " + i + ":");
            if(candidato1.isEmpty()){
                candidato1 =  scanner.nextLine();
            } else if(candidato2.isEmpty()){
                candidato2 =  scanner.nextLine();
            }   else {
                candidato3 =  scanner.nextLine();
            }
        }

        votos = new ArrayList<>();
        votos.add(0, 0); //votos em branco
        votos.add(1, 0); //votos candidato1
        votos.add(2, 0); //votos candidato2
        votos.add(3, 0); //votos candidato3
    }

    public static void votar(String voto){
       for(int i = 0; i < votos.size(); i++){
           if(Integer.parseInt(voto) == i){
               int qntdVoto = votos.get(i);
               votos.add(i, qntdVoto + 1);
           }
       }
    }

    public static void printVotos(){
        System.out.println(candidato1 + ", numero de votos: " + votos.get(1) + " (" +  votos.get(1) * 100.0 / totalDeVotos() + "%)");
        System.out.println(candidato2 + ", numero de votos: " + votos.get(2) + " (" + votos.get(2) * 100.0 / totalDeVotos() + "%)");
        System.out.println(candidato3 + ", numero de votos: " + votos.get(3) + " (" + votos.get(3) * 100.0 / totalDeVotos() + "%)");
        System.out.println("Votos em BRANCO: " + votos.get(0) + " (" + votos.get(0) * 100.0 / totalDeVotos() + "%)");
    }

    public static void printResultado(){
        if (votos.get(1) > votos.get(2) && votos.get(1) > votos.get(3) && votos.get(1) > votos.get(0)) {
            System.out.println("O vencedor é: " + candidato1);
        } else if (votos.get(2) > votos.get(1) && votos.get(2) > votos.get(3) && votos.get(2) > votos.get(0)) {
            System.out.println("O vencedor é: " + candidato2);
        } else if (votos.get(3) > votos.get(2) && votos.get(3) > votos.get(2) && votos.get(3) > votos.get(0)) {
            System.out.println("O vencedor é: " + candidato3);
        } else {
            System.out.println("Houve um empate.");
        }
    }

    public static int totalDeVotos(){
        return votos.stream().mapToInt(i -> i).sum();
    }

    public static boolean eValido(String voto) throws Exception{
        int numero = Integer.parseInt(voto);

        if(!(numero >= 0 && numero <= 3)){
            throw new Exception();
        }

        return true;
    }

}
