package APIforTrelloByOleksii.PojoClasses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class TrelloCreateNewCardRequest {
    private String idList;
    private String name;

}
