import org.junit.Test;
import punto3.GeneradorReporte;
import punto3.Reporte;
import punto3.ReporteSinVerificar;
import punto3.ReporteVerificado;

import java.io.File;

public class Punto3 {
    @Test
    public void generarReporteSinVerificar(){
        var file = new File("reporte.txt");

        Reporte reporteSinVerificar = new ReporteSinVerificar(new GeneradorReporte("BOCAAA"));

        reporteSinVerificar.exportar(file);


    }
    @Test
    public void generarReporteVerificado(){
        var file = new File("reporte.txt");

        Reporte reporteSinVerificar = new ReporteVerificado(new GeneradorReporte("BOCAAA"));

        reporteSinVerificar.exportar(file);


    }

}
