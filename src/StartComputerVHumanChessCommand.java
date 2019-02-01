public class StartComputerVHumanChessCommand implements Command {
    Chess chess;

    public StartComputerVHumanChessCommand(Chess chessGame){
        chess = chessGame;
    }

    @Override
    public void execute() {
        chess.setUpBoard();
        chess.setGameMode(1);
        chess.playGame();
    }

    @Override
    public void undo() {
        chess.setUpBoard();
    }
}
