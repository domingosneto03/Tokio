package tokio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Função de Ackermann");
        System.out.println("Escolha os números para x e y");
        x = Integer.parseInt(in.nextLine());
        y = Integer.parseInt(in.nextLine());
        System.out.println("A função retorna o número " + ackermann(x,y));
    }

    private static int ackermann(int x, int y) {
        if(x==0) {
            return y+1;
        }
        else if(y==0){
            return ackermann(x-1,1);
        }
        else {
            return ackermann(x-1, ackermann(x, y-1));
        }
    }
}