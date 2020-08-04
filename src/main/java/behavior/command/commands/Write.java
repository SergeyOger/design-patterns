package behavior.command.commands;

public class Write extends Command {

    @Override
    public boolean execute() {
        System.out.println("Write command called");
        return true;
    }
}
