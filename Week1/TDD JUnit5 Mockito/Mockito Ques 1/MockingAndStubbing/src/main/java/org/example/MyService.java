package org.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    // Main Method
    public static void main(String[] args) {

        // Real implementation of ExternalApi
        ExternalApi api = new ExternalApi() {
            @Override
            public String getData() {
                return "Real Data";
            }
        };

        MyService service = new MyService(api);

        System.out.println("Data from API: " + service.fetchData());
    }
}