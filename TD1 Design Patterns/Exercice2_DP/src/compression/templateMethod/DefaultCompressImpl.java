package compression.templateMethod;

public class DefaultCompressImpl extends Compresser {
    @Override
    public int[] compresser(int[] data) {
        int[] imageCompresse = new int [data.length/2];

        for (int i = 0; i < imageCompresse.length; i++) {
            imageCompresse[i] = data[i];
        }

        System.out.println("____________________________compression d'image en utilisant la compression par défaut____________________________");

        return imageCompresse;
    }
}
