package behavior.startegy.navigation.strategy;

import behavior.startegy.route.CarRoute;
import behavior.startegy.route.Route;

public class CarRouteBuilder implements RouteBuildingStrategy {

  @Override
  public Route buildRoute() {
    System.out.println("Built new car route");
    return new CarRoute();
  }
}
