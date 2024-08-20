import java.util.Scanner;

public class Q20 {
    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        Pessoa p1 = new Pessoa(nome1, idade1);
        sc.nextLine(); //limpando buffer
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();
        Pessoa p2 = new Pessoa(nome2, idade2);

        if (p1.getIdade() > p2.getIdade()) {
            System.out.println("Pessoa mais velha: " + p1.getNome());
            System.out.println("Pessoa mais nova: " + p2.getNome());
        } else {
            System.out.println("Pessoa mais velha: " + p2.getNome());
            System.out.println("Pessoa mais nova: " + p1.getNome());
        }
    }
}
