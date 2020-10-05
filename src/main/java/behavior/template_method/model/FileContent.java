package behavior.template_method.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class FileContent {

  private String fileName;

  private String fileContent;

}
