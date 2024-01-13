package io.su0.http.exceptions;

public class TimeoutException extends HttpException {

    public TimeoutException(Throwable cause) {
        super(cause);
    }
}
