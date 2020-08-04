package creationals.abstract_factory.factory;

import creationals.abstract_factory.car.Car;
import creationals.abstract_factory.car.components.body.CoupeBody;
import creationals.abstract_factory.car.components.wheel.SportWheels;

public class SportCarFactory implements CarFactory {

  @Override
  public Car assembleCar() {
    return Car.builder().body(new CoupeBody()).wheels(new SportWheels() {
    }).build();
  }
}
