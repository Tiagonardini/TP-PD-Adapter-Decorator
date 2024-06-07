package punto4;

public class ComboBuilder {
    private ICombo iCombo;

    public ComboBuilder(Combo combo) {
        this.iCombo = combo;
    }

    public ComboBuilder conPapas(double valor) {
        this.iCombo = new ConPapas(this.iCombo, valor);
        return this;
    }

    public ComboBuilder conTomate(double valor) {
        this.iCombo = new ConTomate(this.iCombo, valor);
        return this;
    }

    public ComboBuilder conQueso(double valor) {
        this.iCombo = new ConQueso(this.iCombo, valor);
        return this;
    }

    public ComboBuilder conCarne(double valor) {
        this.iCombo = new ConCarne(this.iCombo, valor);
        return this;
    }

    public ICombo build() {
        return this.iCombo;
    }
}




