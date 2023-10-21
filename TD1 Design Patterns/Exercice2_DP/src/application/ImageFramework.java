package application;

import compression.templateMethod.Compresser;
import compression.templateMethod.DefaultCompressImpl;
import filtrage.IFiltrage;
import filtrage.strategy.DefaultFiltrageImpl;

public class ImageFramework {
        private IFiltrage filtre;
        private Compresser compresser;

        public ImageFramework() {
            filtre =  new DefaultFiltrageImpl();
            compresser = new DefaultCompressImpl();
        }

        public void setFiltre(IFiltrage filtre) {
            this.filtre = filtre;
        }

        public IFiltrage getFiltre() {
            return filtre;
        }

        public Compresser getCompress() {
            return compresser;
        }

        public void setCompress(Compresser compress) {
            this.compresser = compress;
        }
    }
