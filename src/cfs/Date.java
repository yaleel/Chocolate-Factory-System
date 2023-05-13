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
public class Date {
    
    private int Day; 
    private int Month; 
    private int Year;
    
    public Date (){
        Day = 00;
        Month = 00;
        Year = 0000;
    }
    public Date (int d,int m,int y){
        Day = d;
        Month = m;
        Year = y;
    }

    public void setDay(int d) {
        Day = d;
    }

    public int getDay() {
        return Day;
    }
  
    public void setMonth(int m) {
        Month = m;
    }

    public int getMonth() {
        return Month;
    }

    public void setYear(int y) {
        Year = y;
    }
    
    public int getYear() {
        return Year;
    }
    
    public String toString(){
        return String.format("%d / %d / %d", Day,Month,Year);
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }
    
}
