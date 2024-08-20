package Lista3;

import java.util.Scanner;
    class Ponto {
        private double x;
        private double y;
    
        public Ponto(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        //getters e setters
        public double getX() {
            return x;
        }
    
        public double getY() {
            return y;
        }
    
        public void setX(double x) {
            this.x = x;
        }
    
        public void setY(double y) {
            this.y = y;
        }
    }
    
    class Retangulo {
        private Ponto p1;
        private Ponto p2;
        private Ponto p3;
        private Ponto p4;
    
        public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
        }
    
        //verifica se os retângulos se interceptam em algum lugar
        public boolean intercepta(Retangulo outroRetangulo) {
                Ponto p1 = this.p1;
                Ponto p2 = this.p2;
                Ponto p3 = this.p3;
                Ponto p4 = this.p4;
            
                Ponto p5 = outroRetangulo.p1;
                Ponto p6 = outroRetangulo.p2;
                Ponto p7 = outroRetangulo.p3;
                Ponto p8 = outroRetangulo.p4;
            
                //verifica se os retângulos se interceptam no eixo x
                if (p1.getX() <= p6.getX() && p3.getX() >= p5.getX()) {
                    // Verifica se os retângulos se interceptam no eixo y
                    if (p1.getX() <= p8.getX() && p3.getX() >= p6.getX()) {
                        return true; //retorna verdadeiro caso os retângulos se interceptam
                    }
                }
            
                //verifica se os retângulos se interceptam no eixo x (inverso)
                if (p5.getX() <= p2.getX() && p7.getX() >= p1.getX()) {
                    //verifica se os retângulos se interceptam no eixo y (inverso)
                    if (p5.getY() <= p4.getY() && p7.getY() >= p2.getY()) {
                        return true; //retorna verdadeiro caso os retângulos se interceptam
                    }
                }
            
                return false; //retorna verdadeiro caso os retângulos não se interceptam
            }
        }
    

    public class Q30 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com as coordenadas dos 4 vértices do primeiro retângulo:");
            System.out.println("Digite as coordenadas x e y do primeiro ponto: ");
            Ponto p1 = new Ponto(scan.nextInt(), scan.nextInt());
            System.out.println("Digite as coordenadas x e y do segundo ponto: ");
            Ponto p2 = new Ponto(scan.nextInt(), scan.nextInt());
            System.out.println("Digite as coordenadas x e y do terceiro ponto: ");
            Ponto p3 = new Ponto(scan.nextInt(), scan.nextInt());
            System.out.println("Digite as coordenadas x e y do quarto ponto: ");
            Ponto p4 = new Ponto(scan.nextInt(), scan.nextInt());
    
            Retangulo retangulo1 = new Retangulo(p1, p2, p3, p4);
    
            System.out.println("Entre com as coordenadas dos 4 veÉrtices do segundo retângulo:");
            System.out.println("Digite as coordenadas x e y do quinto ponto: ");
            Ponto p5 = new Ponto(scan.nextInt(), scan.nextInt());
            System.out.println("Digite as coordenadas x e y do sexto ponto: ");
            Ponto p6 = new Ponto(scan.nextInt(), scan.nextInt());
            System.out.println("Digite as coordenadas x e y do setimo ponto: ");
            Ponto p7 = new Ponto(scan.nextInt(), scan.nextInt());
            System.out.println("Digite as coordenadas x e y do oitavo ponto: ");
            Ponto p8 = new Ponto(scan.nextInt(), scan.nextInt());
    
            Retangulo retangulo2 = new Retangulo(p5, p6, p7, p8);
    
            if (retangulo1.intercepta(retangulo2)) {
                System.out.println("Os retângulos se interceptam em algum lugar.");
            } else {
                System.out.println("Os retângulos não se interceptam em nenhum lugar.");
            }
        }
    }

