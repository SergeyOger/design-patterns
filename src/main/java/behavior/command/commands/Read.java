package behavior.command.commands;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Read extends Command {

  @Override
  public boolean execute() {
    System.out.println("Read command called");

    return true;
  }
}
