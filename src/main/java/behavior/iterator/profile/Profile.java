package behavior.iterator.profile;

import lombok.Getter;

@Getter
public class Profile {

  private String email;

  public Profile(String email) {
    this.email = email;
  }
}
