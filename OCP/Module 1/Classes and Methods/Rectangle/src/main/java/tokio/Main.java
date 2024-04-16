package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rectangle");
        Rectangle obj1 = new Rectangle(5, 4);
        Rectangle obj2 = new Rectangle(3, 3);
        Rectangle obj3 = new Rectangle();

        System.out.println("Verificar se é um quadrado.");
        obj1.esquadria(obj1.getBase(), obj1.getAltura());
        obj2.esquadria(obj2.getBase(), obj2.getAltura());
        obj3.esquadria(obj3.getBase(), obj3.getAltura());
        System.out.println();
        System.out.println("Calcular a área do retângulo");
        obj1.area(obj1.getBase(), obj1.getAltura());
        obj2.area(obj2.getBase(), obj2.getAltura());
        obj3.area(obj3.getBase(), obj3.getAltura());
        System.out.println();
        System.out.println("Calcular o perímetro do retângulo");
        obj1.perimetro(obj1.getBase(), obj1.getAltura());
        obj2.perimetro(obj2.getBase(), obj2.getAltura());
        obj3.perimetro(obj3.getBase(), obj3.getAltura());
        System.out.println();
        System.out.println("Gira");
        obj1.gira(obj1.getBase(), obj1.getAltura());
        obj2.gira(obj2.getBase(), obj2.getAltura());
        obj3.gira(obj3.getBase(), obj3.getAltura());
    }
}