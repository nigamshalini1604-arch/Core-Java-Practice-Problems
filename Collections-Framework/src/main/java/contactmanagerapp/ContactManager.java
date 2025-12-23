package contactmanagerapp;

import javax.swing.*;
import java.util.*;

public class ContactManager {
    Map<String, List<Contact>> contactGroups = new HashMap<>();
    HashSet<String> uniqueContactNumbers = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        if (uniqueContactNumbers.contains(phoneNumber)) {
            System.out.println("Contact with this phone number already exists.");
            return;
        }
        Contact contact = new Contact(name, email, phoneNumber);
        System.out.println("Enter category (e.g., Family, Friends, Work):");
        String category = scanner.nextLine();
        contactGroups.putIfAbsent(category, new ArrayList<>()); // this line handles null pointer exception
        contactGroups.get(category).add(contact); // get the list of contact and add new contact to it
        uniqueContactNumbers.add(phoneNumber);
        System.out.println("category of the contact is :"+category);
        System.out.println("Contact added successfully."+contactGroups);
    }

    public void viewContacts() {
        System.out.println(contactGroups);
        if (contactGroups.isEmpty()) {
            System.out.println("No Contacts Available");
            return;
        }
        for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
            String category = entry.getKey();
            List<Contact> contacts = entry.getValue();
            System.out.println("Category:" + category);
            for (Contact contact : contacts) {
                System.out.println(contact.getName()+" "+contact.getEmail()+" "+contact.getPhoneNumber());
            }
        }
    }

    public void searchContact() {
        System.out.println("Enter your choice 1. Search by Name 2. Search by Phone Number");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            searchContactByName();
        } else if (choice == 2) {
            searchContactByPhoneNumber();
        } else {
            System.out.println("Invalid choice");
        }
    }
    public void searchContactByName() {
        System.out.println("Enter name to search:");
            String name = scanner.nextLine();
            for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
                List<Contact> contacts = entry.getValue();
                for (Contact contact : contacts) {
                    if (contact.getName().equalsIgnoreCase(name)) {
                        System.out.println("Contact found: " + contact);
                        return;
                    }
                    System.out.println("Contact not found with name: " + name);
                }

            }
    }

    public void searchContactByPhoneNumber() {
        System.out.println("Enter phone number to search:");
        String phoneNumber = scanner.nextLine();
        for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
            List<Contact> contacts = entry.getValue();
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println("Contact found: " + contact);
                    return;
                }
                System.out.println("Contact not found with phone number: " + phoneNumber);
            }

        }
    }

    public void deleteContact() {
        System.out.println("Enter phone number of contact to delete:");
        String phoneNumber = scanner.nextLine();
        for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
            List<Contact> contacts = entry.getValue();
            if (contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber))) {
                System.out.println("Contact deleted successfully.");
                uniqueContactNumbers.remove(phoneNumber);
                return;
            }

        }

    }

    public void updateContact() {
        System.out.println("Enter the choice what you want to update 1. Name 2. Email 3. Phone Number");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Enter the name which you want to update:");
                String newName = scanner.nextLine();
                if (newName.isEmpty()) {
                    System.out.println("Name cannot be empty");
                    return;
                }
                for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
                    List<Contact> contacts = entry.getValue();
                    for (Contact contact : contacts) {
                        contact.setName(newName);
                        System.out.println("Name updated successfully.");
                        return;
                    }
                }
                break;
            case 2:
                System.out.println("Enter the email which you want to update:");
                String newEmail = scanner.nextLine();
                if (newEmail.isEmpty()) {
                    System.out.println("Email cannot be empty");
                    return;
                }
                for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
                    List<Contact> contacts = entry.getValue();
                    for (Contact contact : contacts) {
                        contact.setEmail(newEmail);
                        System.out.println("Email updated successfully.");
                        return;
                    }
                }
                break;
            case 3:
                System.out.println("Enter the phone number which you want to update:");
                String newPhoneNumber = scanner.nextLine();
                if (newPhoneNumber.isEmpty()) {
                    System.out.println("Phone number cannot be empty");
                    return;
                }
                if (uniqueContactNumbers.contains(newPhoneNumber)) {
                    System.out.println("Contact with this phone number already exists.");
                    return;
                } else uniqueContactNumbers.add(newPhoneNumber);
                for (Map.Entry<String, List<Contact>> entry : contactGroups.entrySet()) {
                    List<Contact> contacts = entry.getValue();
                    for (Contact contact : contacts) {
                        contact.setPhoneNumber(newPhoneNumber);
                        System.out.println("Phone number updated successfully.");
                        return;
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}












