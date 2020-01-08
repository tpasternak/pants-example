package com.com1;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hellos {
    public static List<String> hellos() {
        return Stream.of("Hello, world", "Witaj, swiecie").map(Format::format).collect(Collectors.toList());
    }
}
