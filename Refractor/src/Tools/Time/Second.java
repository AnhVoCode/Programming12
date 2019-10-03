package Tools.Time;

public class Second implements Theticker{
    int sec;
    public Second(){
        sec = 0;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Second(int sec) {
        this.sec = sec;
    }
    public String toString(){
        if(sec < 10){
            return "0"+ sec;
        }
        else
            return ""+ sec;
    }
    public void tick(){
        sec++;
    }
}
