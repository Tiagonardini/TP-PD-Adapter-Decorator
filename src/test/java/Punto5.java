import org.junit.Test;
import punto5.Concurso;
import punto5.ConcursoEnviarEmail;
import punto5.IConcurso;
import punto5.Participante;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Punto5 {
    @Test
    public void envioDeEmail() {
        // Configurar las fechas del concurso
        LocalDateTime inicio = LocalDateTime.of(2024, 6, 1, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2024, 6, 30, 23, 59);

        // Crear concurso y participante
        Concurso concurso = new Concurso(inicio, fin, 1, "Concurso de Prueba");
        IConcurso concursoConEnvioEmail = new ConcursoEnviarEmail(concurso);
        Participante participante = new Participante("Juan Perez", "juan.perez@example.com");

        // Inscribir participante el primer día
        LocalDateTime fechaInscripcion = LocalDateTime.of(2024, 6, 1, 10, 0);
        concursoConEnvioEmail.inscribirParticipante(participante, fechaInscripcion);


    }
}
