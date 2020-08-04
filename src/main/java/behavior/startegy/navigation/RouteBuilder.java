package behavior.startegy.navigation;

import behavior.startegy.navigation.strategy.BikeCyclingRouteBuilder;
import behavior.startegy.navigation.strategy.CarRouteBuilder;
import behavior.startegy.navigation.strategy.RouteBuildingStrategy;
import behavior.startegy.navigation.strategy.WalkingRouteBuilder;
import behavior.startegy.route.Route;

public class RouteBuilder {

  private RouteBuildingStrategy routeBuildingStrategy;

  public Route buildCarRoute() {
    routeBuildingStrategy = new CarRouteBuilder();
    return routeBuildingStrategy.buildRoute();
  }

  public Route buildWalkingRoute() {
    routeBuildingStrategy = new WalkingRouteBuilder();
    return routeBuildingStrategy.buildRoute();
  }

  public Route buildBikeCyclingRoute() {
    routeBuildingStrategy = new BikeCyclingRouteBuilder();
    return routeBuildingStrategy.buildRoute();
  }

}
