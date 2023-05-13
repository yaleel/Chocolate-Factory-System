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
public class Nuts extends Products{
   
    public String Type;
     
    public Nuts() {
       super();
       Type = null;
    }
    
    public Nuts(String n,double p, String i, double c, String s, double sug,String Type) {
        super(n,p,i,c,s,sug);
        this.Type = Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public String toString() {
        return super.toString()+"\nType: " + Type;
    }
}
