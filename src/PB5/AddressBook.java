package PB5;

import java.util.Arrays;

public class AddressBook {
    private String name;
    private Contact[] contacts;
    private ContactGroup[] contactGroups;
    public AddressBook(String name, Contact[] contacts, ContactGroup[] contactGroups){
        this.name=name;
        this.contacts=contacts;
        this.contactGroups=contactGroups;
    }
    public Contact[] getContacts(){
        return this.contacts;
    }
    public String getName(){
        return this.name;
    }
    public void insertContact(Contact contact){
        //we will first double the size of the array because it has a fixed size
        this.contacts= Arrays.copyOf(this.contacts, 2*this.contacts.length);
        for (int i=0; i<this.contacts.length; i++){
            if (this.contacts[i]==null){
                this.contacts[i]=contact;
                break;
            }
        }
    }
    public void setName(String name){
        this.name=name;
    }
}
