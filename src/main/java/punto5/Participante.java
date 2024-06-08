package punto5;

public class Participante {
    private String nombre;
    private String email;
    private int puntos;

    public Participante(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public int setPuntos(int puntos){
        return this.puntos += puntos;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getEmail(){
        return this.email;
    }
}
