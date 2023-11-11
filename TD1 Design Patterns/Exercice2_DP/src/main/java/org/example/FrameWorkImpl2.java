package org.example;

import java.util.Arrays;

public class FrameWorkImpl2 extends FrameWork {
    @Override
    protected int[] compressPart1(int[] data) {
        return Arrays.stream(data).filter(num->num%2==0).toArray();
    }

    @Override
    protected int[] compressPart2(int[] data) {
       Arrays.sort(data);
        return data;
    }
}
