package contact;

import java.util.ArrayList;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class Contact {
    private int contactID;

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getisFreContact() {
        return isFreContact;
    }

    public void setFreContact(boolean freContact) {
        isFreContact = freContact;
    }

    private String name;
    private boolean isFreContact;
    private ArrayList<Phone> phoneArrayList;


    public Contact(int contactID,String name,boolean isFreContact){
        setContactID(contactID);
        setFreContact(isFreContact);
        setName(name);
        phoneArrayList=new ArrayList<Phone>(3);

    }
    public ArrayList getPhones(){
        return phoneArrayList;
    }

    public void addPgoneToContact(Phone aPhone){
        phoneArrayList.add(aPhone);
        aPhone.setContact(this);
    }


}
