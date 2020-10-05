package behavior.command.commands;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Write extends Command {

  @Override
  public boolean execute() {
    System.out.println("Write command called");

    return true;
  }
}
