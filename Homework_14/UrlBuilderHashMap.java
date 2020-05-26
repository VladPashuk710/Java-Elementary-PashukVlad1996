package Homework_14;

import java.util.HashMap;
import java.util.Map;

public class UrlBuilderHashMap {

    public static void main(String[] args) {

        UrlMap url = new UrlMap();

        HashMap<String, String> params = new HashMap<>();

        HashMap protocol = new HashMap();

        HashMap domain = new HashMap();

        HashMap port = new HashMap();

        HashMap path = new HashMap();

        HashMap param = new HashMap();

        HashMap key = new HashMap();

        HashMap value = new HashMap();

        url.withParams(params);
        url.withProtocol(protocol);
        url.withDomain(domain);
        url.withPort(port);
        url.withPath(path);
        url.withParam(param);
        url.build(protocol, domain, port, path, param, key, value);

        System.out.println("Url: " + protocol + domain + port + path + param + key + value);
        System.out.println(url.hashCode());
    }
}

