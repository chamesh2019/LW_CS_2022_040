package LW_03.lib;

public class Owner {
    private String ownerName;
    private String phoneNumber;

    public Owner(String ownerName, String phoneNumber) {
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
