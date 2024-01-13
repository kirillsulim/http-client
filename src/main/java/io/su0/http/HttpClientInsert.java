package io.su0.http;

import org.apache.commons.lang3.tuple.Pair;

public interface HttpClientInsert {

    Pair<HttpRequest, HttpRequestContext> preprocessRequest(HttpRequest request, HttpRequestContext context);

    HttpResponse postprocessResponse(HttpResponse response, HttpRequestContext context);
}
