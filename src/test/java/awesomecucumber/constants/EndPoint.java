package awesomecucumber.constants;

public enum EndPoint {
    TIME("/time/viewEmployeeTimesheet"),
    LOGIN("/auth/login"),
    DASHBOARD("/dashboard/index");

    public final String url;

    EndPoint(String url) {
        this.url = url;
    }
}
