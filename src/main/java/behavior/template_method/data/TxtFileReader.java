package behavior.template_method.data;

import behavior.template_method.data.model.FileContent;

public class TxtFileReader extends FileReader {

  @Override
  public FileContent readSourceData() {
    return FileContent.builder().fileName("TXT file").fileContent("example").build();
  }
}
