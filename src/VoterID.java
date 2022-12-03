//voter ID Class
public class VoterID {
//no variables needed here
public static int giveVoterID(String name, String address,String state, int zipcode){
    int VoterID=0;
    String stringCode;
    stringCode = String.valueOf(zipcode);
    String sum = name + " " + address + " " + state + " " + stringCode;
    //find sum of acii characters of above string and make that VoterID
    for( int x = 0; x<sum.length(); x++){
        if(sum.charAt(x)==' '){//spaces add 1
            VoterID++;
        }else
VoterID+= sum.charAt(x);//add ASCII code to sum
    }
    return VoterID; 
}
//NOTE: THIS NEEDS TO BE CHECKED VS OTHER VOTERIDS AND ADD ++ IN THE VOTER CLASS UNTIL UNIQUE
//NOTE: THIS NEEDS TO BE CHECKED VS OTHER VOTERIDS AND ADD ++ IN THE VOTER CLASS UNTIL UNIQUE
//NOTE: THIS NEEDS TO BE CHECKED VS OTHER VOTERIDS AND ADD ++ IN THE VOTER CLASS UNTIL UNIQUE
}