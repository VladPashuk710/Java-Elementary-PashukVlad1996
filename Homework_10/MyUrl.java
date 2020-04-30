package Homework_10;

public class MyUrl {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String params;

    public MyUrl(String protocol, String domain, String port, String path, String params) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.params = params;
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

    public String getParams() {
        return params;
    }

    public static class Builder {
        private MyUrl url = new MyUrl("protocol", "domain", "port", "path", "params");

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
            url.params += param + "&";
            return this;
        }

        public Builder withParam(String key, String value) {
            url.params += key + "=" + value + "&";
            return this;
        }

        public String build() {
            String u ="";
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
            if(url.params != null && !url.params.isEmpty()) {
                if(!url.params.startsWith("?"));
                u = "?";
                u += url.params;
            }
              return u;
        }
    }
}
