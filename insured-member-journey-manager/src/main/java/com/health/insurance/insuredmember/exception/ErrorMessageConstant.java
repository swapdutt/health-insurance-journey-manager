package com.health.insurance.insuredmember.exception;

public class ErrorMessageConstant {

    public static final String DATA_NOT_PRESENT = "The requested data is not present!!!";
    public static final String DATA_ALREADY_PRESENT = "The requested data already exists!!!";
    private ErrorMessageConstant() {
        // Added private constructor to hide the implicit public one as per SonarLint analysis.
    }

}
