package punto1;

public class AdaptadorMotor implements IMotor {
    private MotorElectrico motorElectrico;

    public AdaptadorMotor(MotorElectrico motorE){
        this.motorElectrico = motorE;
    }


    @Override
    public void arrancar() {
        this.motorElectrico.conectarYActivar();
    }

    @Override
    public void acelerar() {
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        this.motorElectrico.detenerYDesconectar();
    }
}
