package creationals.abstract_factory.factory;

import creationals.abstract_factory.car.Car;
import creationals.abstract_factory.car.components.body.CommonBody;
import creationals.abstract_factory.car.components.wheel.CommonWheels;

public class WagonCarFactory implements CarFactory {


  @Override
  public Car assembleCar() {
    return Car.builder().body(new CommonBody()).wheels(new CommonWheels()).build();
  }
}
