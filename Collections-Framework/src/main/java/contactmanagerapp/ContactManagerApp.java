package contactmanagerapp;

public class ContactManagerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Contact Manager App!");
        DisplayContactManager displayContactManager = new DisplayContactManager();
        displayContactManager.startManager();
    }
}
