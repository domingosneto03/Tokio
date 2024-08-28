package tokio;

public class Main {
    public static void main(String[] args) {
        String string1 = "AeIoU";
        String string2 = "A abelha e feroz";
        String string3 = "A abelha é feroz";
        int res = contarVogais(string3);
        System.out.println(string3 + " tem " + res + " vogais");
    }

    private static int contarVogais(String string) {
        String lowered = string.toLowerCase();
        int count = 0;
        for(int i=0; i<lowered.length(); i++) {
            if(lowered.charAt(i) == 'a' || lowered.charAt(i) == 'e' || lowered.charAt(i) == 'i' || lowered.charAt(i) == 'o' || lowered.charAt(i) == 'u') count++;
        }
        return count;
    }
}