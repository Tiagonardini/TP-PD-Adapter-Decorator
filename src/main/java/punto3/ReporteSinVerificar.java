package punto3;

import java.io.File;


public class ReporteSinVerificar implements Reporte {
    private Reporte reporte;

    public ReporteSinVerificar(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        reporte.exportar(file);
        if (file.exists()) {
            System.out.println("El Archivo se sobreescribió.");
        } else {
            System.out.println("El Archivo se creó correctamente.");
        }
    }
}


