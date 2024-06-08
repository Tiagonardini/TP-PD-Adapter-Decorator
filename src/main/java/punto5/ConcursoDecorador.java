package punto5;

import java.time.LocalDateTime;

public abstract class ConcursoDecorador implements IConcurso{
    protected IConcurso concurso;

    public ConcursoDecorador(Concurso concursoDecorado) {
        this.concurso = concursoDecorado;
    }

    @Override
    public void inscribirParticipante(Participante participante, LocalDateTime fechaInscripcion) {
        concurso.inscribirParticipante(participante, fechaInscripcion);
    }

}
