public class StartHumanVHumanChessCommand implements Command {
    Chess chess;

    public StartHumanVHumanChessCommand(Chess chessGame){
        chess = chessGame;
    }

    @Override
    public void execute() {
        chess.setUpBoard();
        chess.setGameMode(2);
        chess.playGame();
    }

    @Override
    public void undo() {
        chess.setUpBoard();
    }
}
