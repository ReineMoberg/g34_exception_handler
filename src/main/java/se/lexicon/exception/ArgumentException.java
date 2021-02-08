package se.lexicon.exception;

import se.lexicon.model.CustomErrors;

public class ArgumentException extends RuntimeException {

    private CustomErrors errors;

    public ArgumentException(CustomErrors errors){
        super(errors.getErrorMessage());
        this.errors = errors;
    }

    public CustomErrors getErrors() {
        return errors;
    }
}
