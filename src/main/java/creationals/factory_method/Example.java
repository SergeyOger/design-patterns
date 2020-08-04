package creationals.factory_method;

import creationals.factory_method.installer.OperationSystemInstaller;
import creationals.factory_method.os.OperationSystem;
import creationals.factory_method.os.OperationSystemType;

public class Example {

  public static void main(String[] args) {

    OperationSystem linuxOperationSystem
        = OperationSystemInstaller.installOperationSystem(OperationSystemType.LINUX);
    System.out.println("Installed operation system: " + linuxOperationSystem.getSystemName());

    OperationSystem windowsOperationSystem
        = OperationSystemInstaller.installOperationSystem(OperationSystemType.WINDOWS);
    System.out.println("Installed operation system: " + windowsOperationSystem.getSystemName());
  }
}
