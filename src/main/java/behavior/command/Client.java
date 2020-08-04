package behavior.command;

import behavior.command.commands.Read;
import behavior.command.commands.Write;

public class Client {

    public boolean read() {
        return new Read().execute();
    }

    public boolean write() {
        return new Write().execute();
    }
}
