package es.dasaur.di.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

import es.cic.di.domain.Vehiculo;
import es.cic.di.sample.Runner;

public class Main {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new MainModule());
    Runner.exe(injector.getInstance(Vehiculo.class), injector.getInstance(Vehiculo.class));
  }

}
