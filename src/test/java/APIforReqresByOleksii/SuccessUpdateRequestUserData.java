package APIforReqresByOleksii;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessUpdateRequestUserData {
        private String name;
        private String job;
        private Date updatedAt;

//    public SuccessUpdateRequestUserData() {}
}
