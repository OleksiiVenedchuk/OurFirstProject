package APIforTrelloByOleksii.PojoClasses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttachmentsByType {
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("AttachmentsByType")
    private String AttachmentsByType;
}
