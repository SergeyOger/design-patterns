package behavior.mediator;

import behavior.mediator.factory.BoltTightenRobot;
import behavior.mediator.factory.Conveyor;
import behavior.mediator.factory.CuttingRobot;
import behavior.mediator.factory.WeldingRobot;

public class Example {

  public static void main(String[] args) {

    FactoryProductionLine factoryProductionLine = new FactoryProductionLine(new Conveyor(), new BoltTightenRobot(),
        new WeldingRobot(), new CuttingRobot());
    factoryProductionLine.assembleUnit();
    factoryProductionLine.disassembleUnit();
  }
}
