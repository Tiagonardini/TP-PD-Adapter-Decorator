package punto4;

public class Combo implements ICombo{
    private String tipo;
    private String descripcion;
    private double valor;


    public Combo (String tipo, String descripcion, double valor){
        this.valor = valor;
        this.descripcion= descripcion;
        this.tipo = tipo;
    }

    @Override
    public double calcularCombo() {
        return valor;
    }
}
