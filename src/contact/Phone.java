package contact;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class Phone {
    private String phoneNum;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    private String type;
    private Contact contact;

    public Phone(String phoneNum, String type,Contact contact) {
        setPhoneNum(phoneNum);
        setType(type);
        setContact(contact);
        contact.addPgoneToContact(this);
    }
}
