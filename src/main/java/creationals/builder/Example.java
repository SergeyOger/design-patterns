package creationals.builder;

import creationals.builder.App.AppBuilder;
import java.util.Collections;

public class Example {

  public static void main(String[] args) {
    App app = new AppBuilder().setEndpoints(Collections.emptyList())
        .setServices(Collections.emptyList()).build();
  }
}
