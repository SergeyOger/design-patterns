package creationals.abstract_factory.car;

import creationals.abstract_factory.car.components.body.Body;
import creationals.abstract_factory.car.components.wheel.Wheels;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Car {

  private Wheels wheels;

  private Body body;
}
