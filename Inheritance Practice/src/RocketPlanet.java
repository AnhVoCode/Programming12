public class RocketPlanet extends Planet {
    //Fields
    boolean habitable;

    //Constructor
    RocketPlanet(int orbitTime, String designation, boolean habitable){
        super(orbitTime,designation);
        this.habitable = habitable;
    }

    //Methods
    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return super.toString() + "\tIs Habitable: " + habitable;
    }
}
