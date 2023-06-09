package APIforTrelloByOleksii.PojoClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cover {
    private Object idAttachment;
    private Object color;
    private Object idUploadedBackground;
    private String size;
    private String brightness;
    private Object idPlugin;
}
