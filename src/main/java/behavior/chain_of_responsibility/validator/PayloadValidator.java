package behavior.chain_of_responsibility.validator;

import behavior.chain_of_responsibility.model.Request;

public class PayloadValidator extends RequestValidator{
    @Override public boolean validate(Request request) {

        return request.getPayload() != null && checkNext(request);
    }
}
