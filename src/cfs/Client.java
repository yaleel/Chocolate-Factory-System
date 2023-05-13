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
public class Client extends Customers {

    public int stamp = 0;

    public Client() {
        super();
    }

    public Client(String n, long ph, int p, Date d) {
        super(n, ph, p, d);
    }

    public void setStamp(int c) {
        stamp = c;
    }

    public int getStamp() {
        return stamp;
    }

    public void stampCount() {
        if (stamp < 9) {
            stamp++;
            System.out.println((10 - stamp) + " stamps remaining to get 1 free product");
        } else {
            stamp = 0;
            System.out.println("Congratulations!! you got 1 free product");
        }

    }

    public void Discount() {
        System.out.printf("\nCongratulations!! you got %d%% discount\n\n", ((int) (2 + Math.random() * 20)));
    }

    public String toString() {
        return "Name: " + Name + "\nPhone Number: " + phoneNum + "\nPoints: " + Points + "\nDate: " + date + "\nStamps: " + stamp;
    }
}
