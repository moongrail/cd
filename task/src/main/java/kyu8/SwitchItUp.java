package kyu8;

import java.util.Arrays;

public class SwitchItUp {
    public static String switchItUp(int number)
    {
        return Arrays.stream(Number.values())
                .filter(i -> i.ordinal() == number)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .toString();
    }
}
 enum Number{
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