import java.util.Scanner;

public class Q21 {
    public static abstract class Funcionario {
        private int salario;
        public Funcionario(int salario) {
            this.salario = salario;
        }
        public int getSalario() {
            return salario;
        }
        
        public abstract double emprestimoPossivel();
    }

    public static class Diretoria extends Funcionario {
        public Diretoria(int salario) {
            super(salario);
        }

        @Override
        public double emprestimoPossivel() {
            return getSalario() * 1.3;
        }
    }

    public static class Gerencia extends Funcionario {

        public Gerencia(int salario) {
            super(salario);
        }

        @Override
        public double emprestimoPossivel() {
            return getSalario() * 1.25;
        }
    }

    public static class Operacional extends Funcionario {


        public Operacional(int salario) {
            super(salario);
        }

        @Override
        public double emprestimoPossivel() {
            return getSalario() * 1.2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário de um funcionário: ");
        int salario = sc.nextInt();
        sc.nextLine(); //limpando buffer 
        System.out.println("Digite o cargo do funcionário (Diretoria/Gerencia/Operacional): ");
        String cargo = sc.nextLine();
        sc.close();
        if (cargo.equals("Diretoria")) {
            System.out.println("O emprestimo para o cargo de Diretoria é de: ");
            System.out.println(new Diretoria(salario).emprestimoPossivel());
        } else if (cargo.equals("Gerencia")) {
            System.out.println("O emprestimo para o cargo de Gerencia é de: ");
            System.out.println(new Gerencia(salario).emprestimoPossivel());
        } else if (cargo.equals("Operacional")) {
            System.out.println("O emprestimo para o cargo de Operacional é de: ");
            System.out.println(new Operacional(salario).emprestimoPossivel());
        }
    }
}
