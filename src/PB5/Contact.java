package PB5;

public class Contact {
    private String emailAdress;
    private String faxNumber;
    private String name;
    private String primaryContactMethod;
    public String getEmailAdress(){
        return this.emailAdress;
    }
    public String getFaxNumber(){
        return this.faxNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getPrimaryContactMethod(){
        return this.primaryContactMethod;
    }
    public void setEmailAdress(String emailAdress){
        this.emailAdress=emailAdress;
    }
    public void setFaxNumber(String faxNumber){
        this.faxNumber=faxNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrimaryContactMethod(String primaryContactMethod){
        this.primaryContactMethod=primaryContactMethod;
    }
}
