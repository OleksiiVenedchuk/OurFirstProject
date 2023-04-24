package APIforTrelloByOleksii.PojoClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prefs {
    public String permissionLevel;
    public boolean hideVotes;
    public String voting;
    public String comments;
    public String invitations;
    public boolean selfJoin;
    public boolean cardCovers;
    public boolean isTemplate;
    public String cardAging;
    public boolean calendarFeedEnabled;
    public ArrayList<Object> hiddenPluginBoardButtons;
    public ArrayList<SwitcherView> switcherViews;
    public String background;
    public Object backgroundColor;
    public String backgroundImage;
    public ArrayList<BackgroundImageScaled> backgroundImageScaled;
    public boolean backgroundTile;
    public String backgroundBrightness;
    public String backgroundBottomColor;
    public String backgroundTopColor;
    public boolean canBePublic;
    public boolean canBeEnterprise;
    public boolean canBeOrg;
    public boolean canBePrivate;
    public boolean canInvite;
}
