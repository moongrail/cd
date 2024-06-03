package kyu8;

public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        //code here
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }
}
