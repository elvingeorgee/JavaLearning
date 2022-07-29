package ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> mycontacts = new ArrayList<Contact>();

    public MobilePhone(String number) {
        this.myNumber = number;
        this.mycontacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Error: Contact is already exists.");
            return false;
        }
        this.mycontacts.add(contact);
        System.out.println("Added " + contact.getName() + " to the list.");
        return true;

    }

    private int findContact(Contact contact) {
        return mycontacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i=0; i< this.mycontacts.size();i++){
            String searchName = this.mycontacts.get(i).getName();
            if (searchName.equals(name)){
                return i;
            }
        }
        return -1;

    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            System.out.println("Found " + name + " in the contact list.");
            return this.mycontacts.get(position);
        }
        System.out.println("Error: Did not find " + name + " on the list.");
        return null;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            System.out.println(contact.getName() + " was removed from the list.");
            this.mycontacts.remove(position);
            return true;
        }
        System.out.println("Error: We could not remove the contact.");
        return false;
    }

    public boolean modifyContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println("Error: " +oldContact.getName() + " not found");
            return false;
        } else if(findContact(newContact.getName()) >= 0){
            System.out.println("New contact already exists");
            return false;
        }
        this.mycontacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }



}
