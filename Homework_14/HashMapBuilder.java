package Homework_14;

    class HashMapBuilder extends MyUrlBuilder{

        public static void main(String[] args) throws Exception {
            Builder chromeLink = new MyUrlBuilder.Builder()
                    .withProtocol("http://")
                    .withDomain("youtube.com");
            chromeLink.withPort("3386");
            chromeLink.withPath("chrome");
            chromeLink.withParam("user", "root");
            chromeLink.withParam("password", "root");
            chromeLink.withParam("testMode");
            chromeLink.build();
            System.out.println("URL: " + chromeLink);
        }
    }

