package PB5;

public class Account {
    private String emailAddress;
    private String name;
    private AddressBook[] adressBook;
    public Account(String emailAddress, String name, AddressBook[] addressBook){
        this.emailAddress=emailAddress;
        this.name=name;
        this.adressBook=addressBook;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public String getName(){
        return this.name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }
    public void setName(String name){
        this.name=name;
    }
}
