package behavior.memento;

import behavior.memento.document.DocumentState;
import behavior.memento.state.StateManager;

public class Example {

  public static void main(String[] args) {
    StateManager.addSnapshot(new DocumentState("test"));
    System.out.println(StateManager.getLatestDocumentState());
  }
}
