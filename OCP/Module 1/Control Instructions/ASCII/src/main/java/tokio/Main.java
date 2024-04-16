package tokio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("UpLow");
        System.out.println("Escreve uma frase");
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine();
        int numeroUpLow = 0;
        int pointFlag = 0;
        StringBuilder fraseUpLow = new StringBuilder();
        for(int i=0; i<frase.length(); i++) {
            char character = frase.charAt(i);
            if(pointFlag==1) {
                fraseUpLow.append(character); // com flag acionada, não acontecem conversões
            }
            else if(character >= 'A' && character <= 'Z') {
                character = (char) (character + 32);
                numeroUpLow++;
                fraseUpLow.append(character); // maiúsculo para minúsculo
            }
            else if(character >= 'a' && character <= 'z') {
                character = (char) (character - 32);
                numeroUpLow++;
                fraseUpLow.append(character); // minúsculo para maiúsculo
            }
            else if(character == '.') {
                pointFlag = 1;
                fraseUpLow.append(character); // a partir do primeiro ponto flag é acionada.
            }
            else fraseUpLow.append(character); // espaços, símbolos, etc

        }
        System.out.println(fraseUpLow);
        System.out.println("Número de conversões: " + numeroUpLow);
    }
}