package com.perscholas.ancestry;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AncestryNotFoundException extends RuntimeException{
}
