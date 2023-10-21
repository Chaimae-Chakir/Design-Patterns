import composants.*;
import decorator.Caramel;
import decorator.Chocolat;

public class Main {
        public static void main(String[] args) {
            /*Boisson boisson;
            boisson = new Sumatra();
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());
            System.out.println("*********************");
            boisson = new Espresso();
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());
            System.out.println("*********************");
            boisson = new Chocolat(boisson);
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());
            System.out.println("*********************");
            boisson =new Caramel(boisson);
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());
            System.out.println("*********************");
            boisson=new Chocolat(boisson);
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());*/

            Boisson boisson1 = new Chocolat(new Caramel(new Caramel(new Sumatra())));
            System.out.println(boisson1.getDescription());
            System.out.println(boisson1.cout());
        }
}
