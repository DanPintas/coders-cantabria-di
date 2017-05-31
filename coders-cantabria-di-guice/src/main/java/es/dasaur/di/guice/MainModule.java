package es.dasaur.di.guice;
import javax.inject.Singleton;

import com.google.inject.AbstractModule;

import es.cic.di.domain.Coche;
import es.cic.di.domain.Motor;
import es.cic.di.domain.MotorV8;
import es.cic.di.domain.Rueda;
import es.cic.di.domain.Vehiculo;

public class MainModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Rueda.class);
    bind(Motor.class).to(MotorV8.class);
    bind(Vehiculo.class).to(Coche.class).in(Singleton.class);
  }

}
