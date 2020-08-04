package behavior.chain_of_responsibility.validator;

import behavior.chain_of_responsibility.model.Request;

public abstract class RequestValidator {

    private RequestValidator nextValidationStage;

    public RequestValidator addFilter(RequestValidator nextValidationStage) {
        this.nextValidationStage = nextValidationStage;
        return nextValidationStage;
    }

    public abstract boolean validate(Request request);

    protected boolean checkNext(Request request) {
        if (nextValidationStage == null) {
            return true;
        }
        return nextValidationStage.validate(request);
    }
}
