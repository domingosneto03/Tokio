package tokio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Figures!");
        System.out.println("--------------------");
        System.out.println();
        List<FiguraCircular2D> list = new ArrayList<>();
        System.out.println("Figuras 2D:");
        System.out.println();
        double alturaTriEQ = Math.sqrt(49 - Math.pow(3.5, 2));

        System.out.println("Figura: Triangulo equilátero -> (base = 7.00, altura = " + String.format("%.2f", alturaTriEQ) + ")");
        Triangulo triangulo = new Triangulo(0,0, "equilatero", 7, alturaTriEQ);
        System.out.println("Area: " + String.format("%.2f", triangulo.area()));
        System.out.println("Perímetro: " + String.format("%.2f", triangulo.perimetro()));
        System.out.println();

        System.out.println("Figura: Triangulo isosceles -> (base = 7.00, altura = 10.00");
        Triangulo triangulo1 = new Triangulo(0,0,"isosceles", 7, 10);
        System.out.println("Area: " + String.format("%.2f", triangulo1.area()));
        System.out.println("Perímetro: " + String.format("%.2f", triangulo1.perimetro()));
        System.out.println();

        System.out.println("Figura: Triangulo escaleno -> (base = 7.00, altura = 10.00");
        Triangulo triangulo2 = new Triangulo(0,0,"escaleno", 7, 10);
        System.out.println("Area: " + String.format("%.2f", triangulo2.area()));
        System.out.println("Perímetro: " + String.format("%.2f", triangulo2.perimetro()));
        System.out.println();

        System.out.println("Figura: Quadrado -> (lado = 5.00)");
        Quadrado quadrado = new Quadrado(0,0,5);
        System.out.println("Area: " + String.format("%.2f", quadrado.area()));
        System.out.println("Perímetro: " + String.format("%.2f", quadrado.perimetro()));
        System.out.println();

        System.out.println("Figura: Pentágono -> (lado = 8.00, apotema = 6.00)");
        PoligonoRegular pentagono = new PoligonoRegular(0,0,5,8,6);
        System.out.println("Area: " + String.format("%.2f", pentagono.area()));
        System.out.println("Perímetro: " + String.format("%.2f", pentagono.perimetro()));
        System.out.println();

        System.out.println("Figura: Hexágono -> (lado = 8.00, apotema = 6.00)");
        PoligonoRegular hexagono = new PoligonoRegular(0,0,6,8,6);
        System.out.println("Area: " + String.format("%.2f", hexagono.area()));
        System.out.println("Perímetro: " + String.format("%.2f", hexagono.perimetro()));
        System.out.println();

        System.out.println("Figura: Círculo -> (raio = 4.00)");
        Circulo circulo = new Circulo(0,0, 4);
        System.out.println("Area: " + String.format("%.2f", circulo.area()));
        System.out.println("Perímetro: " + String.format("%.2f", circulo.perimetro()));
        System.out.println();

        System.out.println("--------------------");
        System.out.println();
        System.out.println("Figuras 3D:");
        System.out.println();

        System.out.println("Figura: Pirâmide Triangular -> (baseSup = 7.00, alturaSup = 6.00, altura = 10.00)");
        Piramide piramideTri = new Piramide(0,0,10,7,6);
        System.out.println("Area da Superfície: " + String.format("%.2f", piramideTri.area()));
        System.out.println("Volume: " + String.format("%.2f", piramideTri.volume()));
        System.out.println();

        System.out.println("Figura: Pirâmide Quadrangular -> (baseSup = 7.00, altura = 10.00)");
        Piramide piramideQuad = new Piramide(0,0,10,7);
        System.out.println("Area da Superfície: " + String.format("%.2f", piramideQuad.area()));
        System.out.println("Volume: " + String.format("%.2f", piramideQuad.volume()));
        System.out.println();


        System.out.println("Figura: Pirâmide Octogonal -> (baseSup = 7.00, apotema = 5.00, altura = 10.00)");
        Piramide piramideOct = new Piramide(0,0,10,8,5,7);
        System.out.println("Area da Superfície: " + String.format("%.2f", piramideOct.area()));
        System.out.println("Volume: " + String.format("%.2f", piramideOct.volume()));
        System.out.println();

        System.out.println("Figura: Cubo -> (aresta = 8.00)");
        Cubo cubo = new Cubo(0,0,8);
        System.out.println("Area da Superfície: " + String.format("%.2f", cubo.area()));
        System.out.println("Volume: " + String.format("%.2f", cubo.volume()));
        System.out.println();

        System.out.println("Figura: Esfera -> (raio = 5.00)");
        Esfera esfera = new Esfera(0,0,5);
        System.out.println("Area da Superfície: " + String.format("%.2f", esfera.area()));
        System.out.println("Volume: " + String.format("%.2f", esfera.volume()));
        System.out.println();

        System.out.println("Figura: Cone -> (raio = 6.00, altura = 9.00)");
        Cone cone = new Cone(0,0,9,6);
        System.out.println("Area da Superfície: " + String.format("%.2f", cone.area()));
        System.out.println("Volume: " + String.format("%.2f", cone.volume()));
        System.out.println();

        System.out.println("Figura: Cilindro -> (raio = 6.00, altura = 9.00)");
        Cilindro cilindro = new Cilindro(0,0, 6, 9);
        System.out.println("Area da Superfície: " + String.format("%.2f", cilindro.area()));
        System.out.println("Volume: " + String.format("%.2f", cilindro.volume()));
        System.out.println();

        System.out.println("--------------------");
        System.out.println();

        System.out.println("Lista de figuras circulares");
        fillList(list);
        printList(list);
        double soma = somarRaios(list);
        System.out.println("Soma dos raios: " + String.format("%.2f", soma));

    }

    private static double somarRaios(List<FiguraCircular2D> list) {
        double soma = 0;
        for(FiguraCircular2D x : list) soma += x.getRaio();
        return soma;
    }

    private static void printList(List<FiguraCircular2D> list) {
        System.out.print("{");
        int idx = 0;
        for(FiguraCircular2D x : list) {
            if(idx==list.size()-1) {
                System.out.print("c" + (idx+1) + "(r=" + String.format("%.2f", x.getRaio()) + ")");
            }
            else {
                System.out.print("c" + (idx+1) + "(r=" + String.format("%.2f", x.getRaio()) + "), ");
                idx++;
            }
        }
        System.out.println("}");
    }

    private static void fillList(List<FiguraCircular2D> list) {
        Random random = new Random();
        int n = random.nextInt(8) + 2;
        while(n>0) {
            int x = random.nextInt(99) + 1;
            double raio = 1.0 * x;
            Circulo circ = new Circulo(0,0, raio);
            list.add(circ);
            n--;
        }
    }
}