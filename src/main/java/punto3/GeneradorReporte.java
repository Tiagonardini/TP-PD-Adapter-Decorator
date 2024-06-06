package punto3;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class GeneradorReporte implements Reporte {
    private String reporte;

    public GeneradorReporte(String reporte){
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        if (file == null){
            throw new IllegalArgumentException("File es NULL no es posible exportar");
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
            System.out.println("Reporte exportado exitosamente a: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al exportar el reporte: " + e.getMessage());
        }
    }
}
