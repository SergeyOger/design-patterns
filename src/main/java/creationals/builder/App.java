package creationals.builder;

import creationals.builder.endpoint.ControllerEndpoint;
import creationals.builder.service.AppService;
import java.util.List;

public class App {

  private List<ControllerEndpoint> endpoints;

  private List<AppService> services;

  private App(List<ControllerEndpoint> endpoints, List<AppService> services) {
    this.endpoints = endpoints;
    this.services = services;
  }

  public static class AppBuilder {

    private List<ControllerEndpoint> endpoints;

    private List<AppService> services;

    public AppBuilder setEndpoints(List<ControllerEndpoint> endpoints) {
      this.endpoints = endpoints;
      return this;
    }

    public AppBuilder setServices(List<AppService> services) {
      this.services = services;
      return this;
    }

    public App build() {
      return new App(endpoints, services);
    }
  }

}
