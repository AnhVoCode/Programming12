public class GasPlanet extends Planet{
    //Fields
    boolean hasRings;
    Color color;

    //Constructors
    GasPlanet(int orbitTime, String designation, boolean hasRings,Color color ){
        super(orbitTime,designation);
        this.hasRings = hasRings;
        this.color = color;

    }

    //Methods
    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\tHas Rings: " + hasRings + "\tColor: "+ color;
    }
}
