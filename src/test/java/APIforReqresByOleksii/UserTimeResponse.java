package APIforReqresByOleksii;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTimeResponse extends UserTime {
    private String updatedAt;
//    public UserTimeResponse(String name, String job, String updatedAt){
//        super(name, job);
//        this.updatedAt = updatedAt;
//    }
//
//    public String getUpdatedAt() {
//        return updatedAt;
//    }

//    public UserTimeResponse () {}

}
