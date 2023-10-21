import adapter.HdmiVgaAdapter;
import adapter.HdmiVgaAdapterH;
import computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentre uniteCentre=new UniteCentre();

        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");

        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        uniteCentre.print("Bonsoir Design Pattern ");

        //simple
        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello");

        //avec adapter en utilisant la composition
        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Bonsoir Design Pattern GLSID");

        //avec adapter en utilisant l'heritage
        uniteCentre.setVga(new HdmiVgaAdapterH());
        uniteCentre.print("hillooww Adapter Heritage");
    }
}