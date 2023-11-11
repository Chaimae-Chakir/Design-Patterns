package org.example;

import java.util.Arrays;

public class FrameWorkImpl1 extends FrameWork {
    @Override
    protected int[] compressPart1(int[] data) {
        // supprimer les doublons
        return  Arrays.stream(data).filter(num->num%2!=0).toArray();
    }

    @Override
    protected int[] compressPart2(int[] data) {
        // trier les éléments
        Arrays.sort(data);
        return data;
    }
}
