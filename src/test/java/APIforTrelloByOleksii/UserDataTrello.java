package APIforTrelloByOleksii;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
//@NoArgsConstructor
public class UserDataTrello {

//    private String actionId;
//    private String apiKey ;
//    private String token ;

    public static RequestSpecification userDataSpecification(){
        return new RequestSpecBuilder()
                .addQueryParam("id", "63debf8017cf538eea53c891")
                .addQueryParam("key", "3d734907a0145d96e3c685eb34110e1b")
                .addQueryParam("token", "ATTAdcda46baea7cf8b719622f78a0d8391b56fa756de7cbb20c9cab0b7e10922b6c00684DF1")
                .addQueryParam("boardIDforDelete","6441125832922f96995e852e")
                .build();
    }


}
