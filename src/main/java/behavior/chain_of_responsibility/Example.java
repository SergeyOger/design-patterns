package behavior.chain_of_responsibility;

import behavior.chain_of_responsibility.model.Request;
import behavior.chain_of_responsibility.validator.HeadersValidator;
import behavior.chain_of_responsibility.validator.PayloadValidator;
import behavior.chain_of_responsibility.validator.RequestValidator;

import java.util.HashMap;

public class Example {

    public static void main(String[] args) {
        Request request = new Request();
        request.setHeaders(new HashMap<>());

        RequestValidator requestValidator = new HeadersValidator();
        requestValidator.addFilter(new PayloadValidator());
        boolean validationResult = requestValidator.validate(request);
        System.out.println(validationResult);
    }
}
