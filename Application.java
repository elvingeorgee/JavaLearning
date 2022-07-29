package ArrayList;

public class Application {

    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone("456848");
        Contact Tim = new Contact("Tim", "456984");
        mobile.addNewContact(Tim);
        mobile.queryContact("Tim");
        mobile.addNewContact(Tim);
        Contact Steven = new Contact("Steven", "344534534");
        mobile.addNewContact(Steven);
        mobile.queryContact("Steven");
        mobile.removeContact(Tim);
        mobile.queryContact("Tim");
        mobile.modifyContact(Tim, Steven);
        Contact Alan = new Contact("Alan", "3234234");
        mobile.modifyContact(Steven, Alan);
        mobile.queryContact("Steven");
        mobile.queryContact("Alan");
    }


}
