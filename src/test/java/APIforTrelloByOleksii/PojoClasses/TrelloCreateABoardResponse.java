package APIforTrelloByOleksii.PojoClasses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class TrelloCreateABoardResponse {
    private String id;
    private String name;
    private String desc;
    private Object descData;
    private boolean closed;
    private String idOrganization;
    private Object idEnterprise;
    private boolean pinned;
    private String url;
    private String shortUrl;
    private Prefs prefs;
    private LabelNames labelNames;
    private Limits limits;
}
