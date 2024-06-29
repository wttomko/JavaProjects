package Solo;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int correctNum;
    int guessAmt;
    int playerguess;

    public GuessNumber(int max){
        System.out.println("Welcome to guess the number! Start by entering a number 0 through " + max);
        Random ran = new Random();
        this.correctNum=ran.nextInt(max);
        this.guessAmt = 0;
        this.playerguess = -1;
    }

    public String checkGuess(int guess){
        this.guessAmt++;
        if (guess < this.correctNum){
            return "Higher";
        } else if (guess > this.correctNum){
            return "Lower";
        } else {
            return "Correct! It took you " + this.guessAmt + " guesses.";
        }
    }

    public static void main(String[] args){
        GuessNumber game = new GuessNumber(2000);
        Scanner scan = new Scanner(System.in);
        while (game.playerguess != game.correctNum){
            game.playerguess = scan.nextInt();
            System.out.println(game.checkGuess(game.playerguess));
        }
        scan.close();
    }
}
