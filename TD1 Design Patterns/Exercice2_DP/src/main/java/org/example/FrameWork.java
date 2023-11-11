package org.example;

public abstract class FrameWork {
    private Filter filter;
    public int[] compresser(int[] data){
        int[] filter1 = filter.filter(data);
        int[] compressedData1 = compressPart1(filter1);
        int[] compressedData2 = compressPart2(compressedData1);
        return compressedData2;
    }
    protected abstract int[] compressPart1(int[] data);
    protected abstract int[] compressPart2(int[] data);

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
