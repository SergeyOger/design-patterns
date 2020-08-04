package behavior.oserver.manager;

import behavior.oserver.subscribers.PostType;
import behavior.oserver.subscribers.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class EventManager {

  private final List<Subscriber> SUBSCRIBERS = new ArrayList<>();

  public void subscribe(Subscriber subscriber) {
    SUBSCRIBERS.add(subscriber);
  }

  public void unsubscribe(Subscriber subscriber) {
    SUBSCRIBERS.remove(subscriber);
  }

  public void sendNewPostNotification(PostType postType) {
    SUBSCRIBERS.stream()
        .filter(subscriber -> subscriber.getPostType() == postType)
        .forEach(subscriber -> System.out.println(
            "Subscriber " + subscriber.getEmail() + " notified about new " + postType + " post"));
  }
}
