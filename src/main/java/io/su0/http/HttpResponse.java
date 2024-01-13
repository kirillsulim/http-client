package io.su0.http;

import java.io.OutputStream;
import java.util.Map;

public class HttpResponse {
    private int statusCode;
    private Map<String, String> headers;
    private OutputStream body;
}
