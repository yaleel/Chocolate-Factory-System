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
public class wareHouse {
    public double Capacity;
    public int employeeesPerDay;

    public wareHouse() {
        Capacity = 0;
        employeeesPerDay = 0;
    }
    
    public wareHouse(double c, int e) {
        Capacity = c;
        employeeesPerDay = e;
    }

    public double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double c) {
        Capacity = c;
    }

    public int getEmployeeesPerDay() {
        return employeeesPerDay;
    }

    public void setEmployeeesPerDay(int e) {
        employeeesPerDay = e;
    }

    public String toString() {
        return "Capacity: " + Capacity + "\nWorking employeees per day: " + employeeesPerDay;
    }
    
}
