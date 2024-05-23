package kyu8;

import java.util.Arrays;

enum Number {
    Zero,
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine
}

public class SwitchItUp {
    public static String switchItUp(int number) {
        return Arrays.stream(Number.values())
                .filter(i -> i.ordinal() == number)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .toString();
    }
}