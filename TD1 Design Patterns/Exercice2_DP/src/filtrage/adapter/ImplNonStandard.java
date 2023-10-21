package filtrage.adapter;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data){
        int[] imageFiltre =data;
        for (int i = 0; i <data.length ; i++) {
            imageFiltre[i] = data[i]+8;
        }
        System.out.println("_______________________Application du filtre sur l'image en utilisant l'ImplNonStandard_______________________");

        return  imageFiltre;
    }
}
