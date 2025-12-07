package org.example.oopsPractice.employeemgmnt;

public class EmployeeMgmntApplication {
    public static void main(String[] args) {
        Manager manager = new Manager("M001", "Alice", "Sales", 10);
        Developer developer = new Developer("D001", "Bob", "Java", "Inventory System");

        manager.mangeTeam();
        manager.conductMeeting();

        developer.writeCode();
        developer.fixBugs();
    }
}
