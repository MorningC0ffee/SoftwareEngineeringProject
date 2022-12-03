//voter class
public class Voter {
    //set all variables
    private String Name;
    private String Address;
    private int VoterID;
    private String State;
    private int Zipcode;
/********************
 * /////////////////
 * Constructors
 * /////////////////
 ********************/
public Voter(){
    Name = "Empty";
    Address = "Empty";
    VoterID = 0; 
    State = "Empty";
    Zipcode = 0;
}
//note: this will need to be created after we have all the variables and since voterid is pulled from name + address we will need another class to create it.
// maybe make it a 10+ length int?
public Voter(String nameInput, String addressInput, String stateInput, int zipcodeInput,int voterIdInput){
    Name = nameInput;
    Address = addressInput;
    VoterID = voterIdInput; 
    State = stateInput;
    Zipcode = zipcodeInput;
}
/********************
 * /////////////////
 * GET METHODS
 * /////////////////
 ********************/
    public String getName(){
    return Name;
    }
    public String getAddress(){
        return Address;
    }
    public int getVoterID(){// This will likely be used to check for identical IDs
        return VoterID;
    }
    public String getState(){
        return State;
    }
    public int getZipcode(){
        return  Zipcode;
    }
/********************
 * /////////////////
 * SET METHODS
 * /////////////////
 ********************/
        public void setName(String newName){
            this.Name = newName;
        }
        public void setAddress(String newAddress){
            this.Address = newAddress;
        }
        public void setVoterID(int newVoterID){//for setting voter IDs to ++ until unique
            this.VoterID = newVoterID;
        }
        public void setState(String newState){
            this.State = newState;
        }
        public void setZipcode(int newZipcode){
            this.Zipcode = newZipcode;
        }
}
