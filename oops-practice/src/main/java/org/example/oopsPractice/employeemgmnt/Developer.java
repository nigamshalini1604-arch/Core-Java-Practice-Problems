package org.example.oopsPractice.employeemgmnt;

public class Developer extends Employee {
    public String programmingLanguage;
    public String project;

    public Developer(String id, String name, String programmingLanguage, String project) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
        this.project = project;
    }
    public void writeCode() {
        System.out.println("Developer"+super.name+"Writing code in " + programmingLanguage + " for project: " + project);
    }
    public void fixBugs() {
        System.out.print("And also Fixing bugs in project: " + project);
    }

}
