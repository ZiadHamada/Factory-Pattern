package program;

public class MemberFactory {
    public Staff getStaff(String staffName){
        if(staffName == null){
            return null;
        }
        else if(staffName.equalsIgnoreCase("TEAHCHASSISTANT")){ 
            return new TeachAssistant();
        }
        else if(staffName.equalsIgnoreCase("DOCTOR")){
            return new Doctor();
        }
        return null;
    }
}
