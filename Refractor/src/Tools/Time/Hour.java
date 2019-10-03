package Tools.Time;

public class Hour implements Theticker{
    private int hour;
    Hour(){
        hour = 0;
    }
    public Hour(int hour){
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public String toString(){
        if(hour < 10){
            return "0"+ hour;
        }
        else
            return ""+ hour;
    }
    public void tick(){
        hour++;
    }
}
