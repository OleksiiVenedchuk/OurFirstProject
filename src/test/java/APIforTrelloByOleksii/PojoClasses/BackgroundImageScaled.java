package APIforTrelloByOleksii.PojoClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackgroundImageScaled {
    private int width;
    private int height;
    private String url;
}
