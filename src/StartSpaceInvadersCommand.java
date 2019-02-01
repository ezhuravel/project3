public class StartSpaceInvadersCommand implements Command {
    SpaceInvaders spaceInvaders;

    public StartSpaceInvadersCommand(SpaceInvaders sp){
        spaceInvaders = sp;
    }

    @Override
    public void execute() {
        spaceInvaders.resetGame();
        spaceInvaders.startGame();
        spaceInvaders.playGame();
    }

    @Override
    public void undo() {
        spaceInvaders.resetGame();
    }
}
