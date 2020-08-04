package behavior.startegy.navigation.strategy;

import behavior.startegy.route.CarRoute;
import behavior.startegy.route.Route;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarRouteBuilder implements RouteBuildingStrategy {

  @Override
  public Route buildRoute() {
    log.info("Built new car route");
    return new CarRoute();
  }
}
