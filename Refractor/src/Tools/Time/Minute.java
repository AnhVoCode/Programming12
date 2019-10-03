package Tools.Time;

public class Minute implements Theticker{
    int min;
    public Minute(){
        min = 0;
    }

    public Minute(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    public String toString(){
        if(min < 10){
            return "0"+ min;
        }
        else
            return ""+ min;
    }
    public void tick(){
        min++;
    }
}
