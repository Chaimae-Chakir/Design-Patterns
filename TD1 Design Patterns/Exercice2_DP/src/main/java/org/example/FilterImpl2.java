package org.example;

import java.util.Arrays;

public class FilterImpl2 implements Filter {
    @Override
    public int[] filter(int[] data) {
        return Arrays.stream(data).filter(value -> value > 2).toArray();
    }
}
