package behavior.iterator.network;

import behavior.iterator.profile.Profile;
import java.util.List;
import lombok.Data;

@Data
public class Network implements NetworkProfileIterator {

  private int currentIndex = 0;

  private List<Profile> profiles;

  public Network(List<Profile> profiles) {
    this.profiles = profiles;
  }

  @Override
  public Profile getNext() {
    if (!hasNext()) {
      return null;
    }

    Profile currentProfile = profiles.get(currentIndex);
    currentIndex++;
    return currentProfile;
  }

  @Override
  public boolean hasNext() {
    return currentIndex < profiles.size();
  }
}
