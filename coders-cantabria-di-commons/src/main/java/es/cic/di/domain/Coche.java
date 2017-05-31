package es.cic.di.domain;

import javax.inject.Inject;

public class Coche implements Vehiculo {

  private final Motor motor;
  private final Rueda rueda1, rueda2, rueda3, rueda4;

  @Inject
  public Coche(Motor motor, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
    this.motor = motor;
    this.rueda1 = rueda1;
    this.rueda2 = rueda2;
    this.rueda3 = rueda3;
    this.rueda4 = rueda4;
  }

  @Override
  public void muestraMotor() {
    System.out.println("Mi motor es " + motor.getClass().getSimpleName());
  }

  @Override
  public boolean ruedasDistintas() {
    return !rueda1.equals(rueda2) && !rueda1.equals(rueda3) && !rueda1.equals(rueda4)
        && !rueda2.equals(rueda3) && !rueda2.equals(rueda4) && !rueda3.equals(rueda4);
  }

}
