package tokio;

public class Main {
    public static void main(String[] args) {
        String string1 = "Radar";
        String string2 = "O galo ama o lago";

        if(esPalindromo(string1)) System.out.println(string1 + " -> é palíndromo.");
        else System.out.println(string1 + " -> não é palíndromo.");

        if(esPalindromo(string2)) System.out.println(string2 + " -> é palíndromo.");
        else System.out.println(string2 + " -> não é palíndromo.");
    }

    private static boolean esPalindromo(String string) {
        StringBuilder modified = new StringBuilder();
        String lowered = string.toLowerCase();
        for(int i=0; i<lowered.length(); i++){
            if(lowered.charAt(i)!=' ') modified.append(lowered.charAt(i));
        }
        string = modified.toString();
        int start = 0;
        int end = string.length()-1;
        while(start<end) {
            if(string.charAt(start) != string.charAt(end)) return true;
            start++;
            end--;
        }
        return true;
    }
}