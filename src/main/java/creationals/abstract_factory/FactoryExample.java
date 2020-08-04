package creationals.abstract_factory;

import creationals.abstract_factory.car.Car;
import creationals.abstract_factory.factory.CarFactory;
import creationals.abstract_factory.factory.SportCarFactory;

public class FactoryExample {

  public static void main(String[] args) {
    CarFactory factory = new SportCarFactory();
    Car assembledCar = factory.assembleCar();
    System.out.println(assembledCar.getBody());
  }
}
