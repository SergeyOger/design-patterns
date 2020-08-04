package behavior.startegy.navigation.strategy;

import behavior.startegy.route.Route;
import behavior.startegy.route.WalkingRoute;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WalkingRouteBuilder implements RouteBuildingStrategy{

  @Override
  public Route buildRoute() {
    log.info("Built new walking route");
    return new WalkingRoute();
  }
}
