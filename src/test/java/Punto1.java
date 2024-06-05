import org.junit.Test;
import punto1.AdaptadorMotor;
import punto1.MotorComun;
import punto1.MotorEconomico;
import punto1.MotorElectrico;

public class Punto1 {
    @Test
    public void main(){
        var motorComun = new MotorComun();
        var motorEconomico = new MotorEconomico();
        var motorElectrico = new MotorElectrico();

        var adapterMotor = new AdaptadorMotor(motorElectrico);

        motorComun.arrancar();
        motorEconomico.arrancar();
        adapterMotor.arrancar();
        motorComun.acelerar();
        motorEconomico.acelerar();
        adapterMotor.acelerar();
        motorComun.apagar();
        motorEconomico.apagar();
        adapterMotor.apagar();


}
}
