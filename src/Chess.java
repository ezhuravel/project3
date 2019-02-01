import java.util.Scanner;

public class Chess {
    int gameMode;
    int winner;
    Boolean boardSet;

    public void setGameMode(int type){
        switch (type){
            case 1:
                gameMode = 1;
                System.out.println("Setting game Mode to Human v Human");
                break;
            case 2:
                gameMode = 2;
                System.out.println("Setting game Mode to Human v Computer");
                break;
            case 3:
                gameMode = 3;
                System.out.println("Setting game Mode to Computer v Computer");
                break;
            default:
                gameMode = 1;
                System.out.println("Setting game Mode to Human v Human");
                break;
        }
    }

    public void setUpBoard(){
        boardSet = true;
        winner = -1;
        gameMode = -1;
    }

    public void playGame()
    {
        // game simulation
        boardSet = true;
        winner = 1;
        System.out.println("Player one wins!");
    }
}
