package punto3;

import java.io.File;


public class ReporteSinVerificar extends SuperReporte {
    public ReporteSinVerificar(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void exportar(File file) {
        super.exportar(file);
        if (file.exists()) {
            System.out.println("El Archivo se sobreescribió..");
        }else{
            System.out.println("Se creo un nuevo archivo..");

        }
    }
}


