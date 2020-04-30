package Homework_10;

public class UrlBuilderDemo extends MyUrl  {
    public UrlBuilderDemo(String protocol, String domain, String port, String path, String params) {
        super(protocol, domain, port, path, params);
    }

    public static void main(String[] args) throws Exception {
        Builder chromeLink = new Builder()
                .withProtocol("http://")
                .withDomain("youtube.com");
                chromeLink.withPort("3386");
                chromeLink.withPath("chrome");
                chromeLink.withParam("user", "root");
                chromeLink.withParam("password", "root");
                chromeLink.build();
        System.out.println("URL:" + chromeLink);
    }
}

