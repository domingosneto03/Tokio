package tokio;

public class Game {
    public boolean didGuess(int answer, int userOption) {
        if(userOption == answer) {
            System.out.println("Congratulations! You got it right!!!");
            return true;
        }
        else if(userOption < answer) {
            System.out.println("Hmm the correct number is higher.");
            return false;
        }
        else {
            System.out.println("Hmm the correct number is lower.");
            return false;
        }
    }
}
