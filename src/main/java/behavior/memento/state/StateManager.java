package behavior.memento.state;

import behavior.memento.document.DocumentState;
import java.util.LinkedList;
import java.util.List;

public class StateManager {

  private static int CURRENT_BACKUP_VERSION_NUMBER = -1;

  private static final List<String> BACKUPS = new LinkedList<>();

  public static void addSnapshot(DocumentState state) {
    BACKUPS.add(state.getText());
    CURRENT_BACKUP_VERSION_NUMBER++;
  }

  public static DocumentState getLatestDocumentState() {
    if (CURRENT_BACKUP_VERSION_NUMBER == -1) {
      return new DocumentState("");
    }
    DocumentState documentState = new DocumentState(BACKUPS.get(CURRENT_BACKUP_VERSION_NUMBER));
    CURRENT_BACKUP_VERSION_NUMBER--;
    return documentState;
  }
}
