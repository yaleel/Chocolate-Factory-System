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
public class coffeeChoco extends Products {
    
  public String Type;
  public double coffeeRate;
  
  public coffeeChoco(){
    super();
      Type ="unregistered";
      coffeeRate=0;    
  }
  public coffeeChoco(String n,double p, String i, double c, String s, double sug,String t,double co){
      super(n,p,i,c,s,sug);
      Type=t;
      coffeeRate=co; 
   }
   public void setType(String t){
     Type=t;      
   }
   public void setcoffeeRate( double co){
     coffeeRate=co;      
   }
    public String getType(){
       return (Type);       
   }
     public double getcoffeeRate(){
       return (coffeeRate);       
   }
      public String toString() {
       return(super.toString()+"\nType: "+Type+"\nCoffee rate: "+coffeeRate+"%");
   }
    
}

