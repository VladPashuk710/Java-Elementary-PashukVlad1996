package Homework_14;

import java.util.HashMap;

public class UrlMap {

    HashMap withParams(HashMap params) { return params; }

    HashMap withProtocol(HashMap protocol) {
        return protocol;
    }

    HashMap withDomain(HashMap domain) {
        return domain;
    }

    HashMap withPort(HashMap port) {
        return port;
    }

    HashMap withPath(HashMap path) {
        return path;
    }

    HashMap withParam(HashMap param) {
        return param;
    }

    HashMap withParamKey(HashMap key) {
        return key;
    }

    HashMap withParamValue(HashMap value) {
        return value;
    }

    public UrlMap() {
    }

    HashMap build(HashMap protocol, HashMap domain, HashMap port, HashMap path, HashMap param, HashMap key, HashMap value) {
        return protocol;
    }
}
