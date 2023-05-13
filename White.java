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
public class White extends Products{
    public String milkType;

    public White() {
        super();
        milkType = "unregistered";
    }

    public White(String n,double p, String i, double c, String s, double sug,String m) {
        super(n,p,i,c,s,sug);
        milkType = m;
    }

    public void setMilkType(String m) {
        milkType = m;
    }
    public String getMilkType() {
        return milkType;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMilk type: " + milkType;
    }
}
