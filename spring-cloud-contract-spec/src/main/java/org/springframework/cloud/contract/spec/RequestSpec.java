package org.springframework.cloud.contract.spec;

import org.springframework.cloud.contract.spec.internal.Body;
import org.springframework.cloud.contract.spec.internal.BodyMatchers;
import org.springframework.cloud.contract.spec.internal.Cookies;
import org.springframework.cloud.contract.spec.internal.DslProperty;
import org.springframework.cloud.contract.spec.internal.Headers;
import org.springframework.cloud.contract.spec.internal.HttpMethods;
import org.springframework.cloud.contract.spec.internal.Multipart;
import org.springframework.cloud.contract.spec.internal.Url;
import org.springframework.cloud.contract.spec.internal.UrlPath;

import java.util.List;
import java.util.Map;

public class RequestSpec {

    DslProperty method;
    Url url;
    UrlPath urlPath;
    Headers headers;
    Cookies cookies;
    Body body;
    Multipart multipart;
    BodyMatchers bodyMatchers;

    public RequestSpec() {
    }

    public RequestSpec(RequestSpec request) {
        this.method = request.method;
        this.url = request.url;
        this.urlPath = request.urlPath;
        this.headers = request.headers;
        this.cookies = request.cookies;
        this.body = request.body;
        this.multipart = request.multipart;
    }

    public void method(String method) {
        //this.method = toDslProperty(method)
    }

    public void method(HttpMethods.HttpMethod httpMethod) {
        //this.method = toDslProperty(httpMethod.toString())
    }

    public void method(DslProperty method) {
       // this.method = toDslProperty(method)
    }

    public void url(String url) {
        this.url = new Url(url);
    }

//    void url(DslProperty url) {
//        this.url = new Url(url);
//    }
//
//    void url(Object url, @DelegatesTo(UrlPath) Closure closure) {
//        this.url = new Url(url)
//        closure.delegate = this.url
//        closure()
//    }
//
//    void url(DslProperty url, @DelegatesTo(UrlPath) Closure closure) {
//        this.url = new Url(url)
//        closure.delegate = this.url
//        closure()
//    }

    public void urlPath(String path) {
        this.urlPath = new UrlPath(path);
    }

    public void urlPath(DslProperty path) {
        this.urlPath = new UrlPath(path);
    }

//    void urlPath(String path, @DelegatesTo(UrlPath) Closure closure) {
//        this.urlPath = new UrlPath(path)
//        closure.delegate = urlPath
//        closure()
//    }

//    void urlPath(DslProperty path, @DelegatesTo(UrlPath) Closure closure) {
//        this.urlPath = new UrlPath(path)
//        closure.delegate = urlPath
//        closure()
//    }
//
//    void headers(@DelegatesTo(RequestHeaders) Closure closure) {
//        this.headers = new RequestHeaders()
//        closure.delegate = headers
//        closure()
//    }
//
//    void cookies(@DelegatesTo(RequestCookies) Closure closure) {
//        this.cookies = new RequestCookies()
//        closure.delegate = cookies
//        closure()
//    }

    public void body(Map<String, Object> body) {
       // this.body = new Body(convertObjectsToDslProperties(body))
    }

    public void body(List body) {
        //this.body = new Body(convertObjectsToDslProperties(body))
    }
//
//    void body(DslProperty dslProperty) {
//        this.body = new Body(dslProperty);
//    }

    public void body(Object bodyAsValue) {
        this.body = new Body(bodyAsValue);
    }

    public Body getBody() {
        return body;
    }
}
