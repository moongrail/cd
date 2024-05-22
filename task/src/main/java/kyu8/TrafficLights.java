package kyu8;

public class TrafficLights {
    public static String updateLight(String current) {
        return current.equals(Light.red.name()) ?
                Light.green.name() : current.equals(Light.green.name()) ? Light.yellow.name() : Light.red.name();
    }
}

enum Light {
    green,
    yellow,
    red
}
