package APIforTrelloByOleksii.PojoClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trello {
    private int board;
    private int card;
}
