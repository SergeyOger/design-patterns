package behavior.chain_of_responsibility.model;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class Request {

  private Map<String, String> headers = new HashMap<>();

  private String payload;
}
