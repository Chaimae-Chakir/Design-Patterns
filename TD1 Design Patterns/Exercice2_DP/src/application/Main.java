package application;

import compression.templateMethod.CompressChild1;
import compression.templateMethod.CompressChild2;
import compression.templateMethod.Compresser;
import filtrage.IFiltrage;
import filtrage.adapter.FiltrageImpl3;
import filtrage.strategy.FiltrageImpl1;
import filtrage.strategy.FiltrageImpl2;

public class Main {

    public static  void afficherImage(int []image) {
        System.out.println("\t\tAffichage de l'image : ");
        System.out.println("\n\n");
        for(int i=0;i<image.length;i++){
            System.out.print(image[i]+" ");
        }
        System.out.println("\n\n");

    }

    public static void main(String[] args) {
        int[] image=new int[20];
        for (int i = 0; i < image.length; i++) {
            image[i]=1;
        }

        IFiltrage filter1= new FiltrageImpl1();
        IFiltrage filter2= new FiltrageImpl2();
        IFiltrage filter3= new FiltrageImpl3();

        Compresser compress1= new CompressChild1() ;
        Compresser compress2= new CompressChild2();

        System.out.println("______________________Mon image réelle_________________________");
        afficherImage(image);

        ImageFramework framework= new ImageFramework();
        System.out.println("\n___________________image filtre par le filtrage par défaut:_________________________\n");
        int[] imageFiltre1=framework.getFiltre().filtrer(image);
        afficherImage(imageFiltre1);

        System.out.println("\n___________________image compressée par la compression par défaut:_________________________\n");
        int[] imageCompressee1=framework.getCompress().compresser(image);
        afficherImage(imageCompressee1);



        /***********************************************************************/

        System.out.println("\n___________________image filtre par le filtrage 1:_________________________\n");
        framework.setFiltre(filter1);
        int[] imageFiltre2=framework.getFiltre().filtrer(image);
        afficherImage(imageFiltre2);

        System.out.println("\n___________________image compressée par la compression 1:_________________________\n");

        framework.setCompress(compress1);
        int[] imageCompressee2=framework.getCompress().compresser(image);
        afficherImage(imageCompressee2);

        /***********************************************************************/

        System.out.println("\n___________________image filtre par le filtrage 2:_________________________\n");
        framework.setFiltre(filter2);
        int[] imageFiltre3=framework.getFiltre().filtrer(image);
        afficherImage(imageFiltre3);

        System.out.println("\n___________________image compressée par la compression 2:_________________________\n");

        framework.setCompress(compress2);
        int[] imageCompressee3=framework.getCompress().compresser(image);
        afficherImage(imageCompressee3);

        /***********************************************************************/

        System.out.println("\n___________________image filtre par le filtrage de ImplNonStandard:_________________________\n");
        framework.setFiltre(filter3);
        int[] imageFiltre4=framework.getFiltre().filtrer(image);
        afficherImage(imageFiltre4);


    }}