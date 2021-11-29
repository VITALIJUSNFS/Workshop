package contactManagerApp;

public class ContactMain {

    public static void main(String[] args) {

        Contact brother = new Contact();
        brother.setName("Karolis");
        brother.setEmail("karolis@gmail.com");
        brother.setPhoneNumber("+370xxxxxxxxxx");

        ContactsService contactsService = new ContactsService();
        contactsService.addContacts(brother);
        contactsService.showContactsList();

        Contact sister = new Contact("Doana","diana@gmail.com","+370xxxxxx");
        contactsService.addContacts(sister);
        contactsService.showContactsList();

        //Pabandome surasti esama kontakta
        Contact foundContact = contactsService.searchContact("karolis");
        System.out.println("Search Karolis= "+foundContact);
    }
}
