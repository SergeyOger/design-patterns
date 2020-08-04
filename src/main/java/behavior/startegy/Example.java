package behavior.startegy;

import behavior.startegy.navigation.RouteBuilder;

public class Example {

  public static void main(String[] args) {
    RouteBuilder routeBuilder = new RouteBuilder();
    routeBuilder.buildBikeCyclingRoute();
    routeBuilder.buildCarRoute();
    routeBuilder.buildWalkingRoute();
  }

}
