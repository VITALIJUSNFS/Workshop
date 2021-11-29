package contactManagerApp;

public class ContactsService {

    public static Contact[] myContacts = new Contact[5];
    private int contactsCount;

    public void showContactsList() {
        System.out.println();
        System.out.println("<[ MY CONTACTS>]");
        for (Contact myContact : myContacts) {
            if (myContact != null) {
                System.out.println(myContact);
            }
        }
        System.out.println("<[ END MY CONTACTS]>");
    }

    public void addContacts(Contact contactToAdd) {
        // ideti tikrinima, ar ne daug kontaktu.
        myContacts[contactsCount] = contactToAdd;
        contactsCount++;
        System.out.println("Contact was added");
    }

    public Contact searchContact(String fullName){
        for (int i = 0; i < contactsCount; i++) {
            if (myContacts[i].getName().equalsIgnoreCase(fullName)){
                return myContacts[i];
            }
        }
        System.out.println("<[NO CONTACTS FOUND]>");
        return null;
    }
}
