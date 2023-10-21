package computer;

public class UniteCentre {
    private VGA vga;
    public void print(String msg){
        System.out.println("*************************************");
        vga.print(msg);
        System.out.println("*************************************");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
