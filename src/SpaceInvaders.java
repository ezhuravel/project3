import java.util.Random;
import java.util.Scanner;

public class SpaceInvaders {
    String playerName;
    int score;

    public void startGame(){
        System.out.println("Starting Space Invaders!");
        System.out.println("Enter your player Name: ");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
    }

    public void resetGame(){
        score = 0;
        playerName = "";
    }

    public void playGame(){
        Random rand = new Random();
        score = rand.nextInt(50) + 1;

        System.out.println(playerName + " Your score is: " + score);
    }
}
