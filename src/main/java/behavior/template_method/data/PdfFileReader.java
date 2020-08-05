package behavior.template_method.data;

import behavior.template_method.data.model.FileContent;

public class PdfFileReader extends FileReader {

  @Override
  public FileContent readSourceData() {
    return FileContent.builder().fileName("PDF file").fileContent("example").build();
  }
}
