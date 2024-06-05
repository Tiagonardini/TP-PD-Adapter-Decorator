package punto1;

public class MotorEconomico implements IMotor {
    @Override
    public void arrancar() {
        System.out.print("El motor arranco\n");
    }

    @Override
    public void acelerar() {
        System.out.print("El motor acelero\n");

    }

    @Override
    public void apagar() {
        System.out.print("El motor se apago\n");
    }
}
