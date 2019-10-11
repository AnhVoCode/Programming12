package Tools;

import Model.Items;
import Tools.Time.Time;


import java.util.ArrayList;

public class Order {
    ArrayList<Items> theOrder = new ArrayList<>();
    boolean isInInventory;
    Time start;
    Time end;
    boolean out;
    boolean complete;


    public Time getEnd() {
        return end;
    }
    public Order(ArrayList<Items> items, Time start, boolean isInInventory){
        theOrder = items;
        this.start = start;
        this.isInInventory = isInInventory;

        for(int i=0;i<1200;i++){
           start.tick();
           end = start;
        }
        //if the item is not in inventory, gets 10 more minutes to make
        if(isInInventory==false){
            for(int i=0;i<600;i++){
                start.tick();
                end = start;
            }
        }
        out = false;
        complete = false;
    }
    //If the item is done created, and come out, delivery is in progress
    public void deliveryInProgress(){
            out = true;
            System.out.println("Delivery is In Progress");
        }
    //If the item is completed delivering, its delivered
    public void delivered(){
       complete = true;
        System.out.println("The Item is delivered");

    }
    public double getTotalPrice(ArrayList<Items>items){
        double totalPrice=0;
        for(Items i: items){
            totalPrice+=i.getHowMuch();
        }
        return Math.round(totalPrice*100.0)/100.0;
    }
}
