package behavior.command.commands;

public class Read extends Command {

    @Override
    public boolean execute() {
        System.out.println("Read command called");
        return true;
    }
}
