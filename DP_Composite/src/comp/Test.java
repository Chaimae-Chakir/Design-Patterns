package comp;

public class Test {
    public static void main(String[] args) {
        Folder root=new Folder("Design Patterns");
        Folder d1=(Folder) root.addComponent(new Folder("Comportement"));
        Folder d2=(Folder) root.addComponent(new Folder("Structure"));
        Folder d3=(Folder) root.addComponent(new Folder("Création"));
        d1.addComponent(new File("Strategy"));
        d1.addComponent(new File("Observer"));
        d2.addComponent(new File("Decorateur"));
        d2.addComponent(new File("Composite"));
        d2.addComponent(new File("Adapter"));
        d2.addComponent(new File("Singleton"));
        d3.addComponent(new File("Builder"));
        Folder d21= (Folder) d2.addComponent(new Folder("Str21"));
        d21.addComponent(new File("C211"));
        d21.addComponent(new File("C212"));
        d21.addComponent(new File("C213"));
        root.show();
    }
}
