package computer;

public class VideoProjecteur implements VGA{
    @Override
    public void print(String msg) {
        System.out.println("......... VP ..........");
        System.out.println(msg);
        System.out.println("......... VP ..........");
    }
}
