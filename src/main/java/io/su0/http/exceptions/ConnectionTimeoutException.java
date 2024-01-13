package io.su0.http.exceptions;

public class ConnectionTimeoutException extends HttpException {

    public ConnectionTimeoutException(Throwable cause) {
        super(cause);
    }
}
