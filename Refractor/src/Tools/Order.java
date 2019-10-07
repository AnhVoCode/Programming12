package Tools;

import Model.Items;
import Tools.Time.Hour;
import Tools.Time.Minute;
import Tools.Time.Second;
import Tools.Time.Time;


import java.util.ArrayList;

public class Order {
    ArrayList<Items> theOrder = new ArrayList<>();
    boolean isInInventory;
    Time start;
    Time end;
    boolean out;
    boolean complete;

    public Order(ArrayList<Items> items, Time start,boolean isInInventory){
        theOrder = items;

        //if the item is not in inventory, start making it 10 minutes later
        this.isInInventory = isInInventory;
        if (isInInventory=false){
            int startLate = start.getMin().getMin();
           startLate +=10;
           start.setMin(new Minute(startLate));
        }
        this.start = start;

        end = new Time(start);
        for(int i = 0; i < 20;i++){
            end.tick();
        }
        out = false;
        complete = false;
    }

    public void deliveryInProgross(){
        out = true;
    }
    public void delivered(){
        complete = true;
    }
    public double getTotalPrice(ArrayList<Items>items){
        double totalPrice=0;
        for(Items i: items){
            totalPrice+=i.getHowMuch();
        }
        return totalPrice;
    }
}
