package punto3;

import java.io.File;

public class ReporteVerificado implements Reporte {
    private Reporte reporte;

    public ReporteVerificado(Reporte reporte){
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        if (file.exists()) {
            throw new RuntimeException("El archivo ya existe no se puede sobreescribir");
        } else {
            reporte.exportar(file);
        }
    }


}