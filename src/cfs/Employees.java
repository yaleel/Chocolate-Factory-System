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
class Employees implements Staff{
 
  private String Name;
  private long ID;
  private double Salary;
  private String jobTitle;
  private int absenceDays;
  private double WorkingHours;
  
    public Employees() {
       Name="unregistered";
       ID = 0;
       Salary = 0.0;
       jobTitle = null;
       absenceDays = 0;
       WorkingHours = 0;
    }

    public Employees(String n,long id, String j, int a, double w) {
        Name = n;
        ID = id;
        salaryCount();
        jobTitle = j;
        absenceDays = a;
        WorkingHours = w;
        Salary = salaryCount();
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public double getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(double w) {
        this.WorkingHours = w;
        Salary = salaryCount();
    }

    public void setID(long id) {
        this.ID = id;
    }

    public void setSalary(double s) {
        this.Salary = s;
    }

    public void setJobTitle(String j) {
        this.jobTitle = j;
    }

    public void setAbsenceDays(int a) {
        this.absenceDays = a;
    }

    public long getID() {
        return ID;
    }

    public double getSalary() {
        return Salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAbsenceDays() {
        return absenceDays;
    }
    
    public double salaryCount() {   
        return (100*WorkingHours)-(absenceDays*50);
    }

    public String toString() {
        return "Name: "+Name+"\nID: " + ID +"\nJob title: " + jobTitle +"\nSalary: " + Salary +  "\nAbsence days: " + absenceDays;
    } 
}
