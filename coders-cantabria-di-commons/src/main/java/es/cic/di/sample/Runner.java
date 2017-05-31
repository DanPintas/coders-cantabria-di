package es.cic.di.sample;

import es.cic.di.domain.Vehiculo;

public class Runner {

  public static void exe(Vehiculo v1, Vehiculo v2) {
    v1.muestraMotor();
    System.out.println("Las ruedas son distintas: " + v1.ruedasDistintas());
    System.out.println("Si pido dos coches da el mismo: " + v1.equals(v2));
  }

}
