package org.example;

import java.util.Arrays;

public class FilterImpl1 implements Filter {
    @Override
    public int[] filter(int[] data) {
        return Arrays.stream(data).distinct().toArray();
    }
}
