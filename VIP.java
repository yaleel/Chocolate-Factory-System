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
public class VIP extends Customers{
    public int giftCard;
    public int Stamp = 0;

    public VIP() {
        super();
        giftCard = 0;
    }

    public VIP(String n,long ph,int p,Date d,int giftCard) {
        super(n,ph,p,d);
        this.giftCard = giftCard;
    }
    public void stampCount(){
        if (Stamp<9) {
            Stamp++;
            System.out.println((10-Stamp)+" stamps remaining to get 1 free product");
        }
        else{
            Stamp = 0;
            System.out.println("Congratulations!! you got 1 free product");
        }
        
    }
    public void Discount(){
        System.out.printf("Congratulations!! you got %d%% discount\n",((int)(2+Math.random()*20)));
    }

    public int getGiftCard() {
          return giftCard;
    }

    public void setGiftCards(int giftCard) {
        this.giftCard = giftCard;
    }

    public int getStamp() {
        return Stamp;
    }

    public void setStamp(int Stamp) {
        this.Stamp = Stamp;
    }
    public String toString() {
        return "Name: "+Name+"\nPhone Number: "+phoneNum+"\nPoints: "+Points+"\nDate: "+date+"\nGift cards number: " + giftCard +"\nStamps: "+Stamp;
    }
}
