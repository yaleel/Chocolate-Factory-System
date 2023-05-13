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
public abstract class Customers {
  
    public String Name;
    public long phoneNum;
    public int Points;
    public Date date;
  
  public Customers() {
      Name = "unregistered";
      phoneNum =0;
      Points=0;
  }  
  
   public Customers(String n,long ph,int p,Date d){
      Name = n;
      phoneNum=ph;
      Points=p;  
      date =d;
   }
   public abstract void stampCount();
   public abstract void Discount();

    public String getName() {
        return (Name);
    }

    public void setName(String n) {
        Name=n;
    }

    public long getPhoneNum() {
        return (phoneNum);
    }

    public void setPhoneNum(long ph) {
        phoneNum=ph;
    }
   
    public void setPoints(int p){
        Points=p;   
   }
    public int getPoints(){
       return (Points);       
   }
     public void setDate(Date d){
      date=d;   
   }
     
     public Date getDate(){
       return (date);  
       
   } 
     public String toString() {
       return("Name: "+Name+"\nPhone Number: "+phoneNum+"\nPoints: "+Points+"\nJoining date: "+date);
   }
     
}
