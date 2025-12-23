package contactmanagerapp;

import java.util.Scanner;

public class DisplayContactManager {
    public void startManager()
    {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Contact Manager Application");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    contactManager.addContact();
                    break;
                case 2:
                    contactManager.viewContacts();
                    break;
                case 3:
                    contactManager.searchContact();
                    break;
                case 4:
                    contactManager.deleteContact();
                    break;
                case 5:
                    contactManager.updateContact();
                    return;
                case 6:
                    System.out.println("Exiting Contact Manager. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
