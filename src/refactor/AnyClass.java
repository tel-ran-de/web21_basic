package refactor;

public class AnyClass {
    private String hello;

    public AnyClass(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "AnyClass{" +
                "privet='" + hello + '\'' +
                '}';
    }
}
