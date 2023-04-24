package APIforTrelloByOleksii.PojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrelloCreateNewCardResponse {
    private String id;
    private Badges badges;
    private ArrayList<Object> checkItemStates;
    private boolean closed;
    private boolean dueComplete;
    private Date dateLastActivity;
    private String desc;
    private DescData descData;
    private Object due;
    private Object dueReminder;
    private Object email;
    private String idBoard;
    private ArrayList<Object> idChecklists;
    private String idList;
    private ArrayList<Object> idMembers;
    private ArrayList<Object> idMembersVoted;
    private int idShort;
    private Object idAttachmentCover;
    private ArrayList<Object> labels;
    private ArrayList<Object> idLabels;
    private boolean manualCoverAttachment;
    private String name;
    private int pos;
    private String shortLink;
    private String shortUrl;
    private Object start;
    private boolean subscribed;
    private String url;
    private Cover cover;
    @JsonProperty("isTemplate")
    private boolean isTemplate;
    private Object cardRole;
    private ArrayList<Object> attachments;
    private ArrayList<Object> stickers;
    private Limits limits;
}
