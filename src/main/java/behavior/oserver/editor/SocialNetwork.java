package behavior.oserver.editor;

import behavior.oserver.manager.EventManager;
import behavior.oserver.subscribers.PostType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SocialNetwork implements EventEditor {

  private final EventManager eventManager;

  @Override
  public void createPhotoPost() {
    eventManager.sendNewPostNotification(PostType.PHOTO);
  }

  @Override
  public void createTextPost() {
    eventManager.sendNewPostNotification(PostType.TEXT);
  }
}
