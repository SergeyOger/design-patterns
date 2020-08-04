package behavior.startegy.navigation.strategy;

import behavior.startegy.route.BikeCyclingRoute;
import behavior.startegy.route.Route;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BikeCyclingRouteBuilder implements RouteBuildingStrategy {

  @Override
  public Route buildRoute() {
    log.info("Built new bike cycling route");
    return new BikeCyclingRoute();
  }
}
