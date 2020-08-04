package behavior.oserver.subscribers;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Subscriber {

  private final String email;

  private final PostType postType;

}
