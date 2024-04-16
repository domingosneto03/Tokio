package tokio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CharSequenceTokio");
        System.out.println();
        char[] charArray = new char[5];
        charArray[0] = 'T';
        charArray[1] = 'o';
        charArray[2] = 'k';
        charArray[3] = 'i';
        charArray[4] = 'o';
        CharSequenceTokio x = new ArrayCharSequenceTokio(charArray);
        CharSequenceTokio y = new BackwardsStringCharSequenceTokio("School");

        System.out.println("Escolha uma das opções:" +
                "\t\n (1) ArrayChar" +
                "\t\n (2) BackwarStringChar");
        int choice = Integer.parseInt(in.nextLine());
        if(choice==1) menu(x);
        else menu(y);
    }

    private static String printSequence(CharSequenceTokio back) {
        String res = "";
        for(int i=0; i< back.length(); i++) {
            res += back.charAt(i);
        }
        return res;
    }

    private static void printArray(CharSequenceTokio array) {
    }

    private static void menu(CharSequenceTokio sequence) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sequence: " + printSequence(sequence));
        System.out.println("---------------");
        System.out.println("Que operações desejas fazer?" +
                "\t\n (1) Comprimento da string" +
                "\t\n (2) Valor no índice" +
                "\t\n (3) Subsequência");
        int choice = Integer.parseInt(in.nextLine());
        if(choice==1) System.out.println("Comprimento: " + sequence.length());
        else if(choice==2) {
            System.out.println("Digite o índice:");
            int idx = Integer.parseInt(in.nextLine());
            System.out.println("Valor: " + sequence.charAt(idx));
        }
        else {
            System.out.println("Digite o índice start: ");
            int start = Integer.parseInt(in.nextLine());
            System.out.println("Digite o índice end: ");
            int end = Integer.parseInt(in.nextLine());
            System.out.println("Subsequência: " + printSequence(sequence.subSequence(start, end)));
        }
    }
}