package punto3;

import java.io.File;

public abstract class SuperReporte implements Reporte {
    private Reporte reporte;

    public SuperReporte (Reporte reporte){
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        if (reporte != null) {
            reporte.exportar(file);
        }
    }
}
