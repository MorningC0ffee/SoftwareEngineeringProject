//Class to record votes
//This will be an array of classes so we can tally vote
public class RecordVote{
    private int VoterID;
    private String President;
    private String Senator;
    private String Represenative;
/********************
 * /////////////////
 * Constructor
 * /////////////////
 ********************/
public RecordVote(){
    String President = "Empty";
    String Senator = "Empty";
    String Represenative = "Empty";
}
//note: this will be created after we read and accept their votes
//idea: Have the votes as strings that are cleared after running though the vote
    public RecordVote(int ID, String Pres, String Sen, String Rep){
    VoterID = ID;
    President = Pres;
    Senator = Sen;
    Represenative = Rep;
    }
/********************
 * /////////////////
 * GET METHODS
 * /////////////////
 ********************/
public int getID(){
    return VoterID;
}
public String getPres(){
    return President;
}
public String getSen(){
    return Senator;
}
public String getRep(){
    return Represenative;
}
/********************
 * /////////////////
 * SET METHODS
 * /////////////////
 ********************/
//note: set methods are likely not needed but wrote it here just in case
public void setID(int tempID){
    this.VoterID = tempID;
}
public void setPres(String tempPres){
    this.President = tempPres;
}
public void setSen(String tempSen){
    this.Senator = tempSen;
}
public void setRep(String tempRep){
    this.Represenative = tempRep;
}
}