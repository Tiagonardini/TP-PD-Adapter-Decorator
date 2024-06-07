import org.junit.Test;
import punto4.*;

import static org.junit.Assert.assertEquals;

public class Punto4 {
    @Test
    public void comboConCarne(){

        ICombo combo = new ConCarne(new Combo("FAMILIAR", "Coca cola y pepsi", 1000.0), 1000.0);
        assertEquals(2000.0, combo.calcularCombo(),0.001);
    }
    @Test
    public void comboConPapas(){

        ICombo combo = new ConPapas(new Combo("ESPECIAL", "Coca cola y Sprite", 2000.0), 1500.0);
        assertEquals(3500.0, combo.calcularCombo(),0.001);
    }
    @Test
    public void comboConQueso(){

        ICombo combo = new ConQueso(new Combo("ESPECIAL", "Coca cola y Sprite", 4000.0), 1500.0);
        assertEquals(5500.0, combo.calcularCombo(),0.001);
    }
    @Test
    public void comboConTomate(){

        ICombo combo = new ConTomate(new Combo("X", "Coca cola y Sprite", 1000.0), 2500.0);
        assertEquals(3500.0, combo.calcularCombo(),0.001);
    }
    @Test
    public void comboConTodo(){

        ICombo combo = new ConCarne(new ConTomate(new ConQueso(new ConPapas(new Combo("X", "Coca cola y Sprite", 1000.0),1000),1000), 1000), 1000);
        assertEquals(5000.0, combo.calcularCombo(),0.001);
    }
    @Test
    public void comboConBuilder(){
        var builder = new ComboBuilder(new Combo("ESPECIAL", "Coca cola y Sprite", 4000.0));
        builder.conCarne(1000);
        builder.conQueso(1000);
        builder.conTomate(1000);
        builder.conPapas(1000);
        ICombo iCombo = builder.build();

        assertEquals(8000.0, iCombo.calcularCombo(),0.001);
    }
}
