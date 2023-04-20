package com.health.insurance.medicalhistory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RecordExistException extends RuntimeException {

    public RecordExistException(final String errorMessage) {
        super(errorMessage);
    }

}
