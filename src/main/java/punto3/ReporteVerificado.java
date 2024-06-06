package punto3;

import java.io.File;

public class ReporteVerificado extends SuperReporte {

    public ReporteVerificado(Reporte reporte){
        super(reporte);
    }

    @Override
    public void exportar(File file) {
        if (file.exists()) {
            throw new RuntimeException("El archivo ya existe no se puede sobreescribir");
        } else {
            super.exportar(file);
        }
    }


}