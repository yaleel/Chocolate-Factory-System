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
public class Products {
    
    public String prodName;
    public double Price;
    public String Ingredents;
    public double Calories;
    public String Size;
    public String Sugar;

    public Products() {
        prodName ="unregistered";
        Price = 0;
        Ingredents = "unregistered";
        Calories = 0;
        Size = "unregistered";
        Sugar = "unregistered";
    }
    
    public Products(String n,double p, String i, double c, String s, double sug) {
        prodName = n;
        Price = p;
        Ingredents = i;
        Calories = c;
        Size = s;
        
        if(sug>50)
            Sugar = "high in sugar";
        else if (sug<=50 && sug>10)
            Sugar = "medium amount";
        else if (sug<=10 && sug>0)
            Sugar = "low in sugar";
        else
            Sugar = "sugar free";
        
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String n) {
        prodName = n;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double p) {
        Price = p;
    }

    public String getIngredents() {
        return Ingredents;
    }

    public void setIngredents(String i) {
        Ingredents = i;
    }

    public double getCalories() {
        return Calories;
    }

    public void setCalories(double c) {
        Calories = c;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String s) {
        Size = s;
    }

    public String getSugar() {
        return Sugar;
    }

    public void setSugar(double sug) {
        if(sug>50)
            Sugar = "high in sugar";
        else if (sug<=50 && sug>10)
            Sugar = "medium amount";
        else if (sug<=10 && sug>0)
            Sugar = "low in sugar";
        else
            Sugar = "sugar free";
    }

    public String toString() {
        return "Product Name: "+prodName+"\nPrice: " + Price + "\nIngredents: " + Ingredents + "\nCalories: " + Calories + "\nSize: " + Size + "\nSugar: " + Sugar;
    }
    
}
