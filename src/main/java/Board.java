import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Board {
    private String id;
    private String name;
    private String desc;
    private Object descData;
    private boolean closed;
    private String idOrganization;
    private Object idEnterprise;
    private boolean pinned;
    private String url;
    private String shortURL;
    private Prefs prefs;
    private LabelNames labelNames;
    private Limits limits;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("desc")
    public String getDesc() { return desc; }
    @JsonProperty("desc")
    public void setDesc(String value) { this.desc = value; }

    @JsonProperty("descData")
    public Object getDescData() { return descData; }
    @JsonProperty("descData")
    public void setDescData(Object value) { this.descData = value; }

    @JsonProperty("closed")
    public boolean getClosed() { return closed; }
    @JsonProperty("closed")
    public void setClosed(boolean value) { this.closed = value; }

    @JsonProperty("idOrganization")
    public String getIDOrganization() { return idOrganization; }
    @JsonProperty("idOrganization")
    public void setIDOrganization(String value) { this.idOrganization = value; }

    @JsonProperty("idEnterprise")
    public Object getIDEnterprise() { return idEnterprise; }
    @JsonProperty("idEnterprise")
    public void setIDEnterprise(Object value) { this.idEnterprise = value; }

    @JsonProperty("pinned")
    public boolean getPinned() { return pinned; }
    @JsonProperty("pinned")
    public void setPinned(boolean value) { this.pinned = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("shortUrl")
    public String getShortURL() { return shortURL; }
    @JsonProperty("shortUrl")
    public void setShortURL(String value) { this.shortURL = value; }

    @JsonProperty("prefs")
    public Prefs getPrefs() { return prefs; }
    @JsonProperty("prefs")
    public void setPrefs(Prefs value) { this.prefs = value; }

    @JsonProperty("labelNames")
    public LabelNames getLabelNames() { return labelNames; }
    @JsonProperty("labelNames")
    public void setLabelNames(LabelNames value) { this.labelNames = value; }

    @JsonProperty("limits")
    public Limits getLimits() { return limits; }
    @JsonProperty("limits")
    public void setLimits(Limits value) { this.limits = value; }

}

 class Prefs {
    private String permissionLevel;
    private boolean hideVotes;
    private String voting;
    private String comments;
    private String invitations;
    private boolean selfJoin;
    private boolean cardCovers;
    private boolean isTemplate;
    private String cardAging;
    private boolean calendarFeedEnabled;
    private List<Object> hiddenPluginBoardButtons;
    private List<SwitcherView> switcherViews;
    private String background;
    private String backgroundColor;
    private Object backgroundImage;
    private Object backgroundImageScaled;
    private boolean backgroundTile;
    private String backgroundBrightness;
    private String backgroundBottomColor;
    private String backgroundTopColor;
    private boolean canBePublic;
    private boolean canBeEnterprise;
    private boolean canBeOrg;
    private boolean canBePrivate;
    private boolean canInvite;

    @JsonProperty("permissionLevel")
    public String getPermissionLevel() { return permissionLevel; }
    @JsonProperty("permissionLevel")
    public void setPermissionLevel(String value) { this.permissionLevel = value; }

    @JsonProperty("hideVotes")
    public boolean getHideVotes() { return hideVotes; }
    @JsonProperty("hideVotes")
    public void setHideVotes(boolean value) { this.hideVotes = value; }

    @JsonProperty("voting")
    public String getVoting() { return voting; }
    @JsonProperty("voting")
    public void setVoting(String value) { this.voting = value; }

    @JsonProperty("comments")
    public String getComments() { return comments; }
    @JsonProperty("comments")
    public void setComments(String value) { this.comments = value; }

    @JsonProperty("invitations")
    public String getInvitations() { return invitations; }
    @JsonProperty("invitations")
    public void setInvitations(String value) { this.invitations = value; }

    @JsonProperty("selfJoin")
    public boolean getSelfJoin() { return selfJoin; }
    @JsonProperty("selfJoin")
    public void setSelfJoin(boolean value) { this.selfJoin = value; }

    @JsonProperty("cardCovers")
    public boolean getCardCovers() { return cardCovers; }
    @JsonProperty("cardCovers")
    public void setCardCovers(boolean value) { this.cardCovers = value; }

    @JsonProperty("isTemplate")
    public boolean getIsTemplate() { return isTemplate; }
    @JsonProperty("isTemplate")
    public void setIsTemplate(boolean value) { this.isTemplate = value; }

    @JsonProperty("cardAging")
    public String getCardAging() { return cardAging; }
    @JsonProperty("cardAging")
    public void setCardAging(String value) { this.cardAging = value; }

    @JsonProperty("calendarFeedEnabled")
    public boolean getCalendarFeedEnabled() { return calendarFeedEnabled; }
    @JsonProperty("calendarFeedEnabled")
    public void setCalendarFeedEnabled(boolean value) { this.calendarFeedEnabled = value; }

    @JsonProperty("hiddenPluginBoardButtons")
    public List<Object> getHiddenPluginBoardButtons() { return hiddenPluginBoardButtons; }
    @JsonProperty("hiddenPluginBoardButtons")
    public void setHiddenPluginBoardButtons(List<Object> value) { this.hiddenPluginBoardButtons = value; }

    @JsonProperty("switcherViews")
    public List<SwitcherView> getSwitcherViews() { return switcherViews; }
    @JsonProperty("switcherViews")
    public void setSwitcherViews(List<SwitcherView> value) { this.switcherViews = value; }

    @JsonProperty("background")
    public String getBackground() { return background; }
    @JsonProperty("background")
    public void setBackground(String value) { this.background = value; }

    @JsonProperty("backgroundColor")
    public String getBackgroundColor() { return backgroundColor; }
    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String value) { this.backgroundColor = value; }

    @JsonProperty("backgroundImage")
    public Object getBackgroundImage() { return backgroundImage; }
    @JsonProperty("backgroundImage")
    public void setBackgroundImage(Object value) { this.backgroundImage = value; }

    @JsonProperty("backgroundImageScaled")
    public Object getBackgroundImageScaled() { return backgroundImageScaled; }
    @JsonProperty("backgroundImageScaled")
    public void setBackgroundImageScaled(Object value) { this.backgroundImageScaled = value; }

    @JsonProperty("backgroundTile")
    public boolean getBackgroundTile() { return backgroundTile; }
    @JsonProperty("backgroundTile")
    public void setBackgroundTile(boolean value) { this.backgroundTile = value; }

    @JsonProperty("backgroundBrightness")
    public String getBackgroundBrightness() { return backgroundBrightness; }
    @JsonProperty("backgroundBrightness")
    public void setBackgroundBrightness(String value) { this.backgroundBrightness = value; }

    @JsonProperty("backgroundBottomColor")
    public String getBackgroundBottomColor() { return backgroundBottomColor; }
    @JsonProperty("backgroundBottomColor")
    public void setBackgroundBottomColor(String value) { this.backgroundBottomColor = value; }

    @JsonProperty("backgroundTopColor")
    public String getBackgroundTopColor() { return backgroundTopColor; }
    @JsonProperty("backgroundTopColor")
    public void setBackgroundTopColor(String value) { this.backgroundTopColor = value; }

    @JsonProperty("canBePublic")
    public boolean getCanBePublic() { return canBePublic; }
    @JsonProperty("canBePublic")
    public void setCanBePublic(boolean value) { this.canBePublic = value; }

    @JsonProperty("canBeEnterprise")
    public boolean getCanBeEnterprise() { return canBeEnterprise; }
    @JsonProperty("canBeEnterprise")
    public void setCanBeEnterprise(boolean value) { this.canBeEnterprise = value; }

    @JsonProperty("canBeOrg")
    public boolean getCanBeOrg() { return canBeOrg; }
    @JsonProperty("canBeOrg")
    public void setCanBeOrg(boolean value) { this.canBeOrg = value; }

    @JsonProperty("canBePrivate")
    public boolean getCanBePrivate() { return canBePrivate; }
    @JsonProperty("canBePrivate")
    public void setCanBePrivate(boolean value) { this.canBePrivate = value; }

    @JsonProperty("canInvite")
    public boolean getCanInvite() { return canInvite; }
    @JsonProperty("canInvite")
    public void setCanInvite(boolean value) { this.canInvite = value; }
}

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE)
class Limits {
}


 class LabelNames {
    private String green;
    private String yellow;
    private String orange;
    private String red;
    private String purple;
    private String blue;
    private String sky;
    private String lime;
    private String pink;
    private String black;
    private String greenDark;
    private String yellowDark;
    private String orangeDark;
    private String redDark;
    private String purpleDark;
    private String blueDark;
    private String skyDark;
    private String limeDark;
    private String pinkDark;
    private String blackDark;
    private String greenLight;
    private String yellowLight;
    private String orangeLight;
    private String redLight;
    private String purpleLight;
    private String blueLight;
    private String skyLight;
    private String limeLight;
    private String pinkLight;
    private String blackLight;

    @JsonProperty("green")
    public String getGreen() { return green; }
    @JsonProperty("green")
    public void setGreen(String value) { this.green = value; }

    @JsonProperty("yellow")
    public String getYellow() { return yellow; }
    @JsonProperty("yellow")
    public void setYellow(String value) { this.yellow = value; }

    @JsonProperty("orange")
    public String getOrange() { return orange; }
    @JsonProperty("orange")
    public void setOrange(String value) { this.orange = value; }

    @JsonProperty("red")
    public String getRed() { return red; }
    @JsonProperty("red")
    public void setRed(String value) { this.red = value; }

    @JsonProperty("purple")
    public String getPurple() { return purple; }
    @JsonProperty("purple")
    public void setPurple(String value) { this.purple = value; }

    @JsonProperty("blue")
    public String getBlue() { return blue; }
    @JsonProperty("blue")
    public void setBlue(String value) { this.blue = value; }

    @JsonProperty("sky")
    public String getSky() { return sky; }
    @JsonProperty("sky")
    public void setSky(String value) { this.sky = value; }

    @JsonProperty("lime")
    public String getLime() { return lime; }
    @JsonProperty("lime")
    public void setLime(String value) { this.lime = value; }

    @JsonProperty("pink")
    public String getPink() { return pink; }
    @JsonProperty("pink")
    public void setPink(String value) { this.pink = value; }

    @JsonProperty("black")
    public String getBlack() { return black; }
    @JsonProperty("black")
    public void setBlack(String value) { this.black = value; }

    @JsonProperty("green_dark")
    public String getGreenDark() { return greenDark; }
    @JsonProperty("green_dark")
    public void setGreenDark(String value) { this.greenDark = value; }

    @JsonProperty("yellow_dark")
    public String getYellowDark() { return yellowDark; }
    @JsonProperty("yellow_dark")
    public void setYellowDark(String value) { this.yellowDark = value; }

    @JsonProperty("orange_dark")
    public String getOrangeDark() { return orangeDark; }
    @JsonProperty("orange_dark")
    public void setOrangeDark(String value) { this.orangeDark = value; }

    @JsonProperty("red_dark")
    public String getRedDark() { return redDark; }
    @JsonProperty("red_dark")
    public void setRedDark(String value) { this.redDark = value; }

    @JsonProperty("purple_dark")
    public String getPurpleDark() { return purpleDark; }
    @JsonProperty("purple_dark")
    public void setPurpleDark(String value) { this.purpleDark = value; }

    @JsonProperty("blue_dark")
    public String getBlueDark() { return blueDark; }
    @JsonProperty("blue_dark")
    public void setBlueDark(String value) { this.blueDark = value; }

    @JsonProperty("sky_dark")
    public String getSkyDark() { return skyDark; }
    @JsonProperty("sky_dark")
    public void setSkyDark(String value) { this.skyDark = value; }

    @JsonProperty("lime_dark")
    public String getLimeDark() { return limeDark; }
    @JsonProperty("lime_dark")
    public void setLimeDark(String value) { this.limeDark = value; }

    @JsonProperty("pink_dark")
    public String getPinkDark() { return pinkDark; }
    @JsonProperty("pink_dark")
    public void setPinkDark(String value) { this.pinkDark = value; }

    @JsonProperty("black_dark")
    public String getBlackDark() { return blackDark; }
    @JsonProperty("black_dark")
    public void setBlackDark(String value) { this.blackDark = value; }

    @JsonProperty("green_light")
    public String getGreenLight() { return greenLight; }
    @JsonProperty("green_light")
    public void setGreenLight(String value) { this.greenLight = value; }

    @JsonProperty("yellow_light")
    public String getYellowLight() { return yellowLight; }
    @JsonProperty("yellow_light")
    public void setYellowLight(String value) { this.yellowLight = value; }

    @JsonProperty("orange_light")
    public String getOrangeLight() { return orangeLight; }
    @JsonProperty("orange_light")
    public void setOrangeLight(String value) { this.orangeLight = value; }

    @JsonProperty("red_light")
    public String getRedLight() { return redLight; }
    @JsonProperty("red_light")
    public void setRedLight(String value) { this.redLight = value; }

    @JsonProperty("purple_light")
    public String getPurpleLight() { return purpleLight; }
    @JsonProperty("purple_light")
    public void setPurpleLight(String value) { this.purpleLight = value; }

    @JsonProperty("blue_light")
    public String getBlueLight() { return blueLight; }
    @JsonProperty("blue_light")
    public void setBlueLight(String value) { this.blueLight = value; }

    @JsonProperty("sky_light")
    public String getSkyLight() { return skyLight; }
    @JsonProperty("sky_light")
    public void setSkyLight(String value) { this.skyLight = value; }

    @JsonProperty("lime_light")
    public String getLimeLight() { return limeLight; }
    @JsonProperty("lime_light")
    public void setLimeLight(String value) { this.limeLight = value; }

    @JsonProperty("pink_light")
    public String getPinkLight() { return pinkLight; }
    @JsonProperty("pink_light")
    public void setPinkLight(String value) { this.pinkLight = value; }

    @JsonProperty("black_light")
    public String getBlackLight() { return blackLight; }
    @JsonProperty("black_light")
    public void setBlackLight(String value) { this.blackLight = value; }
}

 class SwitcherView {
    private String id;
    private String viewType;
    private boolean enabled;

    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("viewType")
    public String getViewType() { return viewType; }
    @JsonProperty("viewType")
    public void setViewType(String value) { this.viewType = value; }

    @JsonProperty("enabled")
    public boolean getEnabled() { return enabled; }
    @JsonProperty("enabled")
    public void setEnabled(boolean value) { this.enabled = value; }
}






