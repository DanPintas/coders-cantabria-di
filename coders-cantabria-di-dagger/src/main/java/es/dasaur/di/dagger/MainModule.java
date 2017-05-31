package es.dasaur.di.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import es.cic.di.domain.Coche;
import es.cic.di.domain.Motor;
import es.cic.di.domain.MotorV8;
import es.cic.di.domain.Rueda;
import es.cic.di.domain.Vehiculo;

@Module
public class MainModule {

  @Provides
  public Rueda rueda() {
    return new Rueda();
  }

  @Provides
  public Motor motor() {
    return new MotorV8();
  }

  @Provides
  @Singleton
  public Vehiculo vehiculo(Motor motor, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
    return new Coche(motor, rueda1, rueda2, rueda3, rueda4);
  }

}
