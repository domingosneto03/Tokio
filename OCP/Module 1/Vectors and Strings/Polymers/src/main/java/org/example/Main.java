package org.example;

public class Main {
    public static void main(String[] args) {
        //String string = "CaAdbb";
        String string = "rFvdAaDVb";
        int count = 0;
        StringBuilder reduced = new StringBuilder(); // redução da palavra original
        while(count!=string.length()-1) { // reduzido ao máximo
            for(int i=1; i<string.length(); i++) {
                int left = i-1;
                if(coincide(string.charAt(left),string.charAt(i))) {
                    StringBuilder characters = new StringBuilder(); // par de letras a ser examinado
                    characters.append(string.charAt(left));
                    characters.append(string.charAt(i));
                    reduced = react(string, characters);
                    string = reduced.toString();
                    count = 0;
                    break; // sair do ciclo for
                }
                else count++;
            }
        }
        System.out.println("Polímero reduzido: " + string);
    }

    // Metodo para verificar se as letras sao identicas com polaridades opostas
    private static boolean coincide(char left, char x) {
        int polarLeft = 0, polarX = 0;

        if(left >= 'A' && left <= 'Z') polarLeft = 1;
        else if(left >= 'a' && left <= 'z') polarLeft = -1;

        if(x >= 'A' && x <= 'Z') polarX = 1;
        else if(x >= 'a' && x <= 'z') polarX = -1;

        if(polarLeft!=polarX) {
            return (x == ((char) (left + 32)) || x == ((char) (left - 32)));
        }
        return false;
    }

    // Metodo para a reação e perder as letras
    private static StringBuilder react(String string, StringBuilder characters) {
        StringBuilder word = new StringBuilder();
        String sub = string.replace(characters,"?");
        for(int i=0; i<sub.length();i++) {
            if(sub.charAt(i)!='?') {
                word.append(sub.charAt(i));
            }
        }
        return word;
    }


}