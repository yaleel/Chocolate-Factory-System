/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfs;

/**
 *
 * @author B
 */
class Managers implements Staff {

    private String Name;
    private long ID;
    private double Salary;
    private long phoneNum;
    private double WorkingHours;

    public Managers() {
       Name = "unregistered";
       ID = 0;
       phoneNum = 0;
       WorkingHours = 0;
       Salary = 0;
    }

    public Managers(String n, long id, long p, double w) {
        Name = n;
        ID = id;
        phoneNum = p;
        WorkingHours = w;
        Salary = salaryCount();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void setWorkingHours(double WorkingHours) {
        this.WorkingHours = WorkingHours;
        Salary = salaryCount();
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public long getID() {
        return ID;
    }

    public double getSalary() {
        return Salary;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

  

    public double getWorkingHours() {
        return WorkingHours;
    }

    public double salaryCount() {   
        return (100*WorkingHours);
    }

    public String toString() {
        return "Name: " + Name + "\nID: " + ID + "\nSalary: " + Salary + "\nPhone number: " + phoneNum + "\nWorking hours: " + WorkingHours;
    }

    
}