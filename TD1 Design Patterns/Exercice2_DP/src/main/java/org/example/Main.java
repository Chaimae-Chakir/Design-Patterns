package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputData = {5, 2, 1, 10, 8, 2, 1, 5, 9, 8, 2, 3};
        Filter filter=new FilterImpl2();
        FrameWork frameWork=new FrameWorkImpl2();
        frameWork.setFilter(filter);
        int[] res = frameWork.compresser(inputData);
        Arrays.stream(res).forEach(System.out::println);

    }
}