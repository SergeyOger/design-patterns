package behavior.startegy.navigation.strategy;

import behavior.startegy.route.Route;
import behavior.startegy.route.WalkingRoute;

public class WalkingRouteBuilder implements RouteBuildingStrategy {

  @Override
  public Route buildRoute() {
    System.out.println("Built new walking route");
    return new WalkingRoute();
  }
}
