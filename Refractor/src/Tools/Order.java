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

    Order(ArrayList<Items> items, Time start,boolean isInInventory){
        //if the item is not in inventory, start making it 10 minutes later
        this.isInInventory = isInInventory;
        Minute m = new Minute(10);
        if (isInInventory=false){
            
        }
        theOrder = items;
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
    public double getTotalPrice(){
        return 0;
    }
}
