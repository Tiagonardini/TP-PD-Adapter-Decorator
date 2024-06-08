package punto5;

import java.time.LocalDateTime;

public interface IConcurso {
    void inscribirParticipante(Participante participante, LocalDateTime fechaInscripcion);
}
