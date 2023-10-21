package computer;

public class SuperVP implements VGA, HDMI {
    @Override
    public void view(byte[] data) {
        System.out.println("...... Super VP HDMI .......");
        String msg=new String(data);
        System.out.println(msg);
        System.out.println("...... Super VP HDMI ......");
    }

    @Override
    public void print(String msg) {
        System.out.println("........... Super VP Vga ............");
        System.out.println(msg);
        System.out.println("........... Super VP Vga ............");
    }
}
