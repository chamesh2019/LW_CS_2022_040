package LW_03.Q3;

public class Bicycle {
    Owner owner;

    public Bicycle(String ownerName, String ownerPhoneNumber) {
        this.owner = new Owner(ownerName, ownerPhoneNumber);
    }

    public String getOwnerName(){
        return owner.getOwnerName();
    }

    public void setOwnerName(String ownerName){
        owner.setOwnerName(ownerName);
    }

    public String getOwnerPhoneNumber(){
        return owner.getPhoneNumber();
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber){
        owner.setPhoneNumber(ownerPhoneNumber);
    }
}
