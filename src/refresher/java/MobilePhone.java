package refresher.java;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts){
        if (findContacts(contacts.getName())>= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContacts){
        int foundPosition = findContacts(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContacts);
        System.out.println(oldContact.getName() + " was replaced with " + newContacts.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts){
        int foundPosition = findContacts(contacts);
        if (foundPosition < 0){
            System.out.println(contacts.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + ", was deleted");
        return true;
    }

    private int findContacts(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }

    private int findContacts(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts){
        if (findContacts(contacts)>= 0){
            return contacts.getName();
        }
        return null;
    }
}
