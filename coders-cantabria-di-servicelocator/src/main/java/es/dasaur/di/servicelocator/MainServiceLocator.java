package es.dasaur.di.servicelocator;

import es.cic.di.domain.Coche;
import es.cic.di.domain.Motor;
import es.cic.di.domain.MotorV8;
import es.cic.di.domain.Rueda;
import es.cic.di.domain.Vehiculo;

public class MainServiceLocator extends ServiceLocator {

  public MainServiceLocator() {
    bind(Rueda.class).to(() -> new Rueda());
    bind(Motor.class).to(() -> new MotorV8());
    bind(Vehiculo.class).to(new Coche(get(Motor.class), get(Rueda.class), get(Rueda.class),
        get(Rueda.class), get(Rueda.class)));
  }

}
