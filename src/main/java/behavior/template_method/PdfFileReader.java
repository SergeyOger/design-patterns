package behavior.template_method;

import behavior.template_method.model.FileContent;

public class PdfFileReader extends FileReader {

  @Override
  public FileContent readSourceData() {
    return FileContent.builder().fileName("PDF file").fileContent("example").build();
  }
}
