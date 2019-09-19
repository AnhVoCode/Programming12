import java.util.ArrayList;

public class Planet {
    //Fields
    private int orbitTime;
    private ArrayList<Moon> moons;
    private String designation;

    //Constructors
    Planet(){
        moons = new ArrayList<>();
        orbitTime = 0;
        designation = null;
    }

    Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    //Methods
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon m){
        moons.add(m);
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Planet){
            Planet other = (Planet) obj;
            if(this.getOrbitTime() == other.getOrbitTime()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Designation: " +designation + "\tOrbit Time: "+ orbitTime;
    }


}
