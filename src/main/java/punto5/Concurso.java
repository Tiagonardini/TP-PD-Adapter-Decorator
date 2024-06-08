package punto5;

 import java.time.LocalDateTime;
 import java.util.ArrayList;
 import java.util.List;

public class Concurso implements IConcurso {
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private Integer id;
    private String nombre;
    private List<Participante> participantes;
    private IConcurso IConcurso;

    public Concurso(LocalDateTime inicio, LocalDateTime fin, int id, String nombre){
        this.inicio = inicio;
        this.fin = fin;
        this.id = id;
        this.nombre = nombre;
        this.participantes = new ArrayList<>();
    }

    @Override
    public void inscribirParticipante(Participante participante, LocalDateTime fechaInscripcion) {
        if (fechaInscripcion.isBefore(inicio) || fechaInscripcion.isAfter(fin)) {
            System.out.println("Inscripción fuera de fecha");
        } else {
            if (fechaInscripcion.equals(inicio)) {
                participante.setPuntos(10) ;
            }
            participantes.add(participante);
            System.out.println("Participante inscrito con éxito");
        }
    }
}
