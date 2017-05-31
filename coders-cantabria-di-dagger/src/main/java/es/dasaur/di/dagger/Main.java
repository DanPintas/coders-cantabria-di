package es.dasaur.di.dagger;

import es.cic.di.sample.Runner;

public class Main {

  public static void main(String[] args) {
    MainComponent injector = DaggerMainComponent.builder().build();
    Runner.exe(injector.vehiculo(), injector.vehiculo());
  }

}
