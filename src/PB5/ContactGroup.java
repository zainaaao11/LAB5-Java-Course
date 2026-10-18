package PB5;

public class ContactGroup {
    private String name;
    private Contact[] contacts;
    private int contactCount;
    private ContactGroup[] children;
    private int childCount;
    private ContactGroup parent;
    public ContactGroup(String name, Contact[] contacts, ContactGroup[] children, ContactGroup parent){
        this.name=name;
        this.contacts=contacts;
        this.children = children;
        this.parent=parent;
        this.childCount=0;
        this.contactCount=0;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
