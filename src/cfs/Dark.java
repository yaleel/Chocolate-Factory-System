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
public class Dark extends Products {
    
    public double cocoaRate;
    
    public Dark(){
        super();
        cocoaRate=0;
    }

    public Dark(String n,double p, String i, double c, String s, double sug,double d) {
        super(n,p,i,c,s,sug);
        cocoaRate=d;
    }

    public void setCocoaRate(double c) {
        cocoaRate = c;
    }

    public double getCocoaRate() {
        return cocoaRate;
    }

    public String toString() {
        return super.toString()+"\nCocoa rate: " + cocoaRate+"%";
    }
    
}

