package behavior.chain_of_responsibility;

import behavior.chain_of_responsibility.model.Request;
import behavior.chain_of_responsibility.validator.HeadersValidator;
import behavior.chain_of_responsibility.validator.PayloadValidator;
import behavior.chain_of_responsibility.validator.RequestValidator;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Example {

  public static void main(String[] args) {
    Request expectedInvalidRequest = new Request();
    expectedInvalidRequest.setHeaders(new HashMap<>());

    RequestValidator requestValidator = new HeadersValidator();
    requestValidator.addFilter(new PayloadValidator());
    boolean validationResultForInvalidRequest = requestValidator.validate(expectedInvalidRequest);
    System.out
        .println("Validation result fot invalid request: " + validationResultForInvalidRequest);

    Request expectedValidRequest = new Request();
    expectedValidRequest.setHeaders(new HashMap<>());
    expectedValidRequest.setPayload("{}");

    requestValidator.addFilter(new PayloadValidator().addFilter(new HeadersValidator()));
    boolean validationResultForValidRequest = requestValidator.validate(expectedValidRequest);
    System.out
        .println("Validation result fot valid request: " + validationResultForValidRequest);
  }
}
