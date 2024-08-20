package Lista3;
import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe os dois pontos do plano cartesiano
        System.out.print("Digite o x do vértice superior esquerdo: ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite o y do vértice superior esquerdo: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite o x do vértice inferior direito: ");
        double x2 = scanner.nextDouble();
        System.out.print("Digite o y do vértice inferior direito: ");
        double y2 = scanner.nextDouble();

        // Verifica se os pontos podem constituir um retângulo
        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (x1 == x2) {
            System.out.println("É uma reta vertical.");
        } else if (y1 == y2) {
            System.out.println("É uma reta horizontal.");
        } else {
            System.out.println("É um retângulo.");
            // Calcula e exibe a área do retângulo
            double area = Math.abs((x2 - x1) * (y2 - y1));
            System.out.println("A área do retângulo é: " + area);
        }

        // Recebe outro ponto e exibe a posição dele em relação ao retângulo
        System.out.print("Digite o x do outro ponto: ");
        double x3 = scanner.nextDouble();
        System.out.print("Digite o y do outro ponto: ");
        double y3 = scanner.nextDouble();

        if (x1 == x2 && y1 == y2) {
            // Se é um ponto, o outro ponto está sempre fora
            System.out.println("O ponto está fora do retângulo.");
        } else if (x1 == x2) {
            // Se é uma reta vertical, o outro ponto está sempre à esquerda ou à direita
            if (x3 < x1) {
                System.out.println("O ponto está à esquerda do retângulo.");
            } else if (x3 > x1) {
                System.out.println("O ponto está à direita do retângulo.");
            } else {
                System.out.println("O ponto está na linha do retângulo.");
            }
        } else if (y1 == y2) {
            // Se é uma reta horizontal, o outro ponto está sempre acima ou embaixo
            if (y3 < y1) {
                System.out.println("O ponto está acima do retângulo.");
            } else if (y3 > y1) {
                System.out.println("O ponto está embaixo do retângulo.");
            } else {
                System.out.println("O ponto está na linha do retângulo.");
            }
        } else {
            // Se é um retângulo, o outro ponto pode estar em qualquer posição
            if (x3 < x1 && y3 > y1) {
                System.out.println("O ponto está acima e à esquerda do retângulo.");
            } else if (x3 < x1 && y3 < y1) {
                System.out.println("O ponto está embaixo e à esquerda do retângulo.");
            } else if (x3 > x2 && y3 > y1) {
                System.out.println("O ponto está acima e à direita do retângulo.");
            } else if (x3 > x2 && y3 < y1) {
                System.out.println("O ponto está embaixo e à direita do retângulo.");
            } else if (x3 < x1) {
                System.out.println("O ponto está à esquerda do retângulo.");
            } else if (x3 > x2) {
                System.out.println("O ponto está à direita do retângulo.");
            } else if (y3 > y1) {
                System.out.println("O ponto está acima do retângulo.");
            } else if (y3 < y1) {
                System.out.println("O ponto está embaixo do retângulo.");
            } else {
                System.out.println("O ponto está dentro do retângulo.");
            }
        }
    }
}

