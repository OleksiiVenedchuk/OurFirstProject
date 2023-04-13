package APIforReqresByOleksii;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessCreateRequestUserData {
        private String name;
        private String job;
        private String id;
        private Date createdAt;

//    public SuccessCreateRequestUserData() {}
}
