package io.su0.http;

import io.su0.http.exceptions.HttpException;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HttpClient {

    private final List<HttpClientInsert> inserts;

    public HttpClient(List<HttpClientInsert> inserts) {
        this.inserts = inserts;
    }

    public HttpResponse execute(HttpRequest request, HttpRequestContext context) throws HttpException {
        for (HttpClientInsert httpClientInsert : inserts) {
            final Pair<HttpRequest, HttpRequestContext> processed = httpClientInsert.preprocessRequest(request, context);
            request = processed.getLeft();
            context = processed.getRight();
        }

        HttpResponse response = null; // TODO: Call

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            httpClient.execute()

        } catch (IOException e) {
            throw new HttpException(e);
        }


        final ListIterator<HttpClientInsert> reverseIterator = inserts.listIterator(inserts.size());
        while (reverseIterator.hasPrevious()) {
            response = reverseIterator.previous().postprocessResponse(response, context);
        }
        return response;
    }

    private static HttpUriRequest convert(HttpRequest request) {
        switch (request.getMethod()) {
            case GET: return new HttpGet()

        }

    }
}
