package adapter;

import computer.TV;
import computer.VGA;

public class HdmiVgaAdapterH extends TV implements VGA  {

    @Override
    public void print(String msg) {
        System.out.println("========= Adapter =========");
        super.view(msg.getBytes());
        System.out.println("========= / Adapter =========");
    }
}
