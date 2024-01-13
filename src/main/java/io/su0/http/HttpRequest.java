package io.su0.http;

import java.io.InputStream;
import java.util.Map;

public class HttpRequest {
    private String url;
    private HttpMethod method;
    private Map<String, String> headers;
    private InputStream body;

    public HttpRequest(String url, HttpMethod method, Map<String, String> headers, InputStream body) {
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public InputStream getBody() {
        return body;
    }
}
