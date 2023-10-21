package adapter;

import computer.HDMI;
import computer.VGA;

public class HdmiVgaAdapter implements VGA {
    private HDMI hdmi;

    @Override
    public void print(String msg) {
        System.out.println("========== Adapter ==========");
        byte[] data=msg.getBytes();
        hdmi.view(data);
        System.out.println("========== / Adapter ==========");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
