package behavior.template_method;

import behavior.template_method.model.FileContent;

public class Example {

  public static void main(String[] args) {
    FileReader fileReader = new PdfFileReader();
    FileContent fileContent = fileReader.readSourceData();
    System.out.println(fileContent);
  }
}
