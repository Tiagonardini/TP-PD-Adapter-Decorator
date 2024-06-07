package punto4;

public abstract class Adicionales implements ICombo{
    private ICombo iCombo;
    private double valorAdicional;

    public Adicionales(ICombo iCombo, double valorAdicional){
        this.iCombo = iCombo;
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double calcularCombo() {
        return iCombo.calcularCombo() + valorAdicional;
    }


}
