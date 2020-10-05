package behavior.chain_of_responsibility.validator;

import behavior.chain_of_responsibility.model.Request;

public class HeadersValidator extends RequestValidator {

  @Override
  public boolean validate(Request request) {

    return request.getHeaders() != null && checkNext(request);
  }
}
