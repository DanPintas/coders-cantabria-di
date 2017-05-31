package es.dasaur.di.dagger;

import javax.inject.Singleton;

import dagger.Component;
import es.cic.di.domain.Motor;
import es.cic.di.domain.Rueda;
import es.cic.di.domain.Vehiculo;

@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {

  Rueda rueda();

  Motor motor();

  Vehiculo vehiculo();

}
