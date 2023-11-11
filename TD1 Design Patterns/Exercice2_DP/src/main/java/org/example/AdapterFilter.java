package org.example;

public class AdapterFilter implements Filter {
    private ImplNonStandard implNonStandard;
    @Override
    public int[] filter(int[] data) {
        int[] res = implNonStandard.appliquerFiltre("helloo", data);
        return res;
    }


}
