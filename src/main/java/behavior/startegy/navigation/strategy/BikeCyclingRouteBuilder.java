package behavior.startegy.navigation.strategy;

import behavior.startegy.route.BikeCyclingRoute;
import behavior.startegy.route.Route;

public class BikeCyclingRouteBuilder implements RouteBuildingStrategy {

  @Override
  public Route buildRoute() {
    System.out.println("Built new bike cycling route");
    return new BikeCyclingRoute();
  }
}
