package behavior.chain_of_responsibility.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Request {

    private Map<String, String> headers = new HashMap<>();
    private String payload;
}
