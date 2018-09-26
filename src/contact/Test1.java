package contact;

import java.util.ArrayList;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class Test1 {
    public static void main(String[] args){
        Contact theContact=new Contact(123,"田斐菡",true);
        Phone thePhone1=new Phone("18571455309","工作",theContact);
        Phone thePhone2=new Phone("18571455301","学习",theContact);

        Phone thePhone3=new Phone("18571455302","生活",theContact);

        ArrayList phones=theContact.getPhones();
        String thName=theContact.getName();
        for (int i=0;i<phones.size();i++){
            Phone aphone= (Phone) phones.get(i);
            System.out.println("contact:"+thName+"phone:"+aphone.getPhoneNum()+"type:"+aphone.getType());

        }
//        thePhone.setContact(theContact);
        System.out.println("contact:"+thePhone1.getContact().getName()+"\nFrequency Contact?"+thePhone1.getContact().getisFreContact()
        +"\nthe phone:"+thePhone1.getPhoneNum());

    }
}
