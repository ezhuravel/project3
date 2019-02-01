public class Arcade {
    Command[] commands;

    public Arcade(){
        // sets up arcade with max of 10 games
        commands = new Command[10];
    }

    public void setGame(int slot, Command gameCommand){
        if(slot > commands.length){
            System.out.println("Slot " + slot + " does not exist");
        }
        else {
            commands[slot] = gameCommand;
        }
    }

    public void selectGame(int slot){
        if(slot > commands.length || commands[slot] == null){
            System.out.println("Game doesn't exist");
        }
        else{
            commands[slot].execute();
        }
    }
}
