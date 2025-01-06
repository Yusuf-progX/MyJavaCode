import java.util.Random;
import java.util.Scanner;

class  Game { 
    int rNum;
    int inputNum;

    public Game () {
        Random rand = new Random();
        rNum = rand.nextInt(100);
    }
    public  int takeUserInput(){
        System.out.println("gusse the correct number :");
        Scanner sc = new Scanner(System.in);
        return inputNum = sc.nextInt();
    }
    

    public boolean isCorrectNumber() {
        if (inputNum == rNum) {
            System.out.println("Congratulations! You guessed it right!");
            return true;
        }
        else if (inputNum < rNum) {
            System.out.println("Too low - try a higher number");
        }
        else {
            System.out.println("Too high - try a lower number");
        }
        return false;
    }
    
}

public class GuessGame {
    public static void main(String[] args) {

        System.out.println("welcom to the gesse the number Game :");
        System.out.println("Guess ");

        
        Game game = new Game();
        boolean isGusse = false;
        int attempt = 0 ;

        while (!isGusse) {
            game.takeUserInput();
            isGusse = game.isCorrectNumber();
            attempt++;
        }

        System.out.println("game end!! you gesse the nmber in " + attempt + " attempt");
    }
}
