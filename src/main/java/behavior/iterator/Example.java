package behavior.iterator;

import behavior.iterator.network.Network;
import behavior.iterator.profile.Profile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Example {

  public static void main(String[] args) {

    List<Profile> profiles = new ArrayList<>();

    for (int i = 0; i < 30; i++) {
      profiles.add(new Profile(UUID.randomUUID().toString() + "@mail.com"));
    }

    Network network = new Network(profiles);
    while (network.hasNext()) {
      System.out.println(network.getNext().getEmail());
    }

  }

}
