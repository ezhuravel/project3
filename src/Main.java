public class Main {

    public static void main(String[] args) {
        Chess chessGame = new Chess();
        SpaceInvaders spaceInvaders = new SpaceInvaders();

        StartSpaceInvadersCommand spaceInvadersCommand = new StartSpaceInvadersCommand(spaceInvaders);
        StartComputerVHumanChessCommand cpuVHumanChessCommand = new StartComputerVHumanChessCommand(chessGame);
        StartHumanVHumanChessCommand humanVhumanChessCommand = new StartHumanVHumanChessCommand(chessGame);

        Arcade arcade = new Arcade();
        arcade.setGame(2, spaceInvadersCommand);
        arcade.setGame(5, humanVhumanChessCommand);
        arcade.setGame(3, cpuVHumanChessCommand);
        arcade.setGame(12, cpuVHumanChessCommand);

        arcade.selectGame(2);
        arcade.selectGame(4);
        arcade.selectGame(3);
        arcade.selectGame(5);
    }
}
