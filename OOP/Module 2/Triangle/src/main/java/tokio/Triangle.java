package tokio;

import java.util.Scanner;

public class Triangle {
    public void area(double a, double b, double c) {
        if((a <= (b+c)) && (b <=(a+c)) && (c <= (a+b))) {
            double s = (a+b+c)/2; //semiperimetro
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //fórmula de Heron
            System.out.println("A área do triângulo é " + area);
        }
        else {
            System.out.println("Triângulo inválido. Insira novos valores"); //Quando não forma um triângulo válido
            Scanner in2 = new Scanner(System.in);
            double ladoA = in2.nextDouble();
            Scanner in3 = new Scanner(System.in);
            double ladoB = in3.nextDouble();
            Scanner in4 = new Scanner(System.in);
            double ladoC = in4.nextDouble();
            area(ladoA, ladoB, ladoC);
        }
    }

    //método que verifica o tipo de triângulo
    public void type(double a, double b, double c) {
        if(a==b && a==c && b==c)
            System.out.println("Triângulo equilátero");
        else if(a!=b && a!=c && b!=c)
            System.out.println("Triângulo escaleno");
        else System.out.println("Triângulo isósceles");
    }
}
