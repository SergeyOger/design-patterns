package behavior.mediator;

import behavior.mediator.factory.BoltTightenRobot;
import behavior.mediator.factory.Conveyor;
import behavior.mediator.factory.CuttingRobot;
import behavior.mediator.factory.WeldingRobot;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FactoryProductionLine {

  private final Conveyor conveyor;

  private final BoltTightenRobot boltTightenRobot;

  private final WeldingRobot weldingRobot;

  private final CuttingRobot cuttingRobot;

  public void assembleUnit() {
    conveyor.start();
    weldingRobot.weldTopFrame();
    boltTightenRobot.tightenBolts();
    weldingRobot.weldBottomFrame();
    boltTightenRobot.tightenBolts();
    conveyor.stop();
  }

  public void disassembleUnit() {
    conveyor.start();
    cuttingRobot.cutDetails();
    boltTightenRobot.torquedOutBolts();
    conveyor.stop();
  }
}
