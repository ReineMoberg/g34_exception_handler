package se.lexicon.model;

public enum CustomErrors {
    AMOUNT_NOT_VALID(1000, "Amount is not valid"),
    ACCOUNT_NOT_VALID(1, "Account numbers is not valid"),
    BALANCE_NOT_ENOUGH(2, "no balance");

    CustomErrors(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private int errorCode;
    private String errorMessage;

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
