package org.example.oopsPractice.employeemgmnt;

public class Manager extends Employee{
    public String department;
    public Integer team_size;

    public  Manager(String id,String name,String department,Integer team_size){
        super(id,name);
        this.department=department;
        this.team_size=team_size;
    }
    public void mangeTeam(){
        System.out.println("Manager "+super.name+" Managing a team of size: "+team_size+" in department: "+department);
    }
    public void conductMeeting(){
        System.out.println("Manager  "+super.name+" Conducting a meeting for department: "+department);
    }
}

