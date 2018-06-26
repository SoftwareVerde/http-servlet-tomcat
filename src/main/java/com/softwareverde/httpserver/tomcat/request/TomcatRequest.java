package com.softwareverde.httpserver.tomcat.request;

import com.softwareverde.http.cookie.Cookie;
import com.softwareverde.servlet.GetParameters;
import com.softwareverde.servlet.PostParameters;
import com.softwareverde.servlet.request.Headers;
import com.softwareverde.servlet.request.Request;

import java.util.List;

public class TomcatRequest extends Request {
    public void setHostname(final String hostname) {
        _hostname = hostname;
    }

    public void setFilePath(final String filePath) {
        _filePath = filePath;
    }

    public void setMethod(final HttpMethod method) {
        _method = method;
    }

    public void setHeaders(final Headers requestHeaders) {
        _headers.clear();
        for (final String key : requestHeaders.getHeaderNames()) {
            final List<String> values = requestHeaders.getHeader(key);
            _headers.setHeader(key, values);
        }
    }

    public void setCookies(final List<Cookie> cookies) {
        _cookies.clear();
        _cookies.addAll(cookies);
    }

    public void setGetParameters(final GetParameters getParameters) {
        _getParameters = getParameters;
    }

    public void setRawQueryString(final String queryString) {
        _rawQueryString = queryString;
    }

    public void setPostParameters(final PostParameters postParameters) {
        _postParameters = postParameters;
    }

    public void setRawPostData(final byte[] rawPostData) {
        _rawPostData = rawPostData;
    }
}
