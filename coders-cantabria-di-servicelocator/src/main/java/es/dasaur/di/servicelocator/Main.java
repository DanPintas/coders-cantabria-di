package es.dasaur.di.servicelocator;

import es.cic.di.domain.Vehiculo;
import es.cic.di.sample.Runner;

public class Main {

  public static void main(String[] args) {
    ServiceLocator sl = new MainServiceLocator();
    Runner.exe(sl.get(Vehiculo.class), sl.get(Vehiculo.class));
  }

}
