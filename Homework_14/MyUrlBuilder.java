package Homework_14;

import java.util.HashMap;
import java.util.Map;

public class MyUrlBuilder {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private HashMap<String, String> params = new HashMap<>();

    public MyUrlBuilder(String protocol, String domain, String port, String path, HashMap<String, String> params) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.params = params;
    }

    public MyUrlBuilder() {

    }

    public MyUrlBuilder(String protocol, String domain, String port, String path) {
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public HashMap<String, String> getParams() {
        return params;
    }

    public static class Builder {
        private MyUrlBuilder url = new MyUrlBuilder("protocol", "domain", "port", "path");

        public Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            url.port = port;
            return this;
        }

        public Builder withPath(String path) {
            url.path = path;
            return this;
        }

        public Builder withParam(String param) {
            url.params.put(param, "");
            return this;
        }

        public Builder withParam(String key, String value) {
            url.params.put(key, value);
            return this;
        }

        public Builder withParams(HashMap<String, String> params) {
            url.params.putAll(params);
            return this;
        }

        public String build() {
            String u = "";
            if(url.protocol != null && !url.protocol.isEmpty()) {
                u += url.protocol;
                if (!url.protocol.endsWith("://"))
                    u += "://";
            }

            u += url.domain;

            if (!url.port.isEmpty() && url.port != null) {
                if (!url.port.startsWith(":")) ;
                u = "";
                u += url.port;
            }

            if(url.path != null && !url.path.isEmpty()) {
                if(!url.path.startsWith("/"));
                u = "/";
                u += url.path;
            }

            if(!url.params.isEmpty()) {
                u += "?";

                for(Map.Entry<String, String> entry: url.params.entrySet()) {
                    if(entry.getKey() != null && !entry.getKey().isEmpty())
                        u += entry.getKey() + "=" +entry.getValue() + "&";
                }
        }

            return u;
    }
}
}
