package creationals.factory_method.installer;

import creationals.factory_method.os.Linux;
import creationals.factory_method.os.OperationSystem;
import creationals.factory_method.os.OperationSystemType;
import creationals.factory_method.os.Windows;

public class OperationSystemInstaller {

  private OperationSystemInstaller() {

  }

  public static OperationSystem installOperationSystem(OperationSystemType type) {
    OperationSystem operationSystem;
    switch (type) {
      case LINUX:
        operationSystem = new Linux();
        break;

      case WINDOWS:
        operationSystem = new Windows();
        break;

      default:
        throw new IllegalArgumentException("Unsupported operation system");
    }
    return operationSystem;
  }
}
