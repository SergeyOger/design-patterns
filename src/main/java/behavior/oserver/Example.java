package behavior.oserver;

import behavior.oserver.editor.SocialNetwork;
import behavior.oserver.manager.EventManager;
import behavior.oserver.subscribers.PostType;
import behavior.oserver.subscribers.Subscriber;

public class Example {

  public static void main(String[] args) {

    EventManager eventManager = new EventManager();

    SocialNetwork socialNetwork = new SocialNetwork(eventManager);

    for (int i = 0; i < 10; i++) {
      eventManager.subscribe(new Subscriber("user-photo-" + i + "@mail", PostType.PHOTO));
      eventManager.subscribe(new Subscriber("user-text-" + i + "@mail", PostType.TEXT));
    }
    socialNetwork.createPhotoPost();
    socialNetwork.createTextPost();
  }
}
