package tokio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cálculo do peso na Lua");
        System.out.println("Esclarecimentos iniciais:" +
                "\t\n 1. O peso é uma medida gravitacional medida em Newtons (N)" +
                "\t\n 2. A massa corporal é a medida usada em kilogramas (Kg)" +
                "\t\n 3. Quando se diz por exemplo 'o meu peso é de 70Kg' na verdade está se a medir a massa corporal" +
                "\t\n 4. O peso é calculado através da massa e da aceleração gravítica (P = mg)" +
                "\t\n 5. A massa corporal não muda consoante o local e a sua gravidade, mas sim o peso.");
        double massa;
        double pesoTerra;
        double pesoLua;
        double gTerra = 9.8; // aceleração gravítica na Terra
        double gLua = 1.6; // aceleração gravítica na Lua, cerca de 17% da aceleração da Terra
        System.out.println("Insira a sua massa em Kg");
        massa = Double.parseDouble(in.nextLine());
        pesoTerra = massa * gTerra;
        pesoLua = massa * gLua;
        System.out.println("Na Terra o teu peso é " + pesoTerra + "N e na Lua é " + pesoLua + "N");
        System.out.println("Mas caso faças mesmo questão de saber qual seria a sensação do teu peso na Lua, sem entrar em detalhes técnicos basta multiplicar a tua massa por 0.17!" +
                "\nPortanto podemos dizer que na Lua pesarias " + (massa*0.17) + "Kg.");

    }
}