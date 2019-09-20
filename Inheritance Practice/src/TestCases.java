import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    Planet testPlanet;
    GasPlanet testGasPlanet;
    RockPlanet testRockPlanet;



    @Test
    public void testPlanet() {
        testPlanet = new Planet(8770,"Earth");
        //Test equals() method
        Object o = new Planet(8770, "Earth");
        assertEquals(true, testPlanet.equals(o));
        //Test toString() method
        assertEquals("Designation: " +testPlanet.getDesignation() + "\tOrbit Time: "+ testPlanet.getOrbitTime(),testPlanet.toString());
    }

    @Test
    public void testGasPlanet() {
        testPlanet = new Planet(100000,"Jupiter");
        Color color = new Color("brown orange");
        testGasPlanet = new GasPlanet(testPlanet.getOrbitTime(), testPlanet.getDesignation(), false, color);
        //Test equals() method
        Object o = new GasPlanet(testPlanet.getOrbitTime(), testPlanet.getDesignation(), false, color);
        assertEquals(true, testGasPlanet.equals(o));
        //Test toString() method
        assertEquals(testPlanet.toString() + "\tHas Rings: " + testGasPlanet.isHasRings() + "\tColor: " + color, testGasPlanet.toString());
    }

    @Test
    public void testRockPlanet(){
        testPlanet = new Planet(5390,"Venus");
        testRockPlanet = new RockPlanet(testPlanet.getOrbitTime(),testPlanet.getDesignation(),false);
        //Test equals() method
        Object o = new RockPlanet(testPlanet.getOrbitTime(),testPlanet.getDesignation(),false);
        assertEquals(true, testRockPlanet.equals(o));
        //Test toString() method
        assertEquals(testPlanet.toString() + "\tIs Habitable: " + testRockPlanet.isHabitable(),testRockPlanet.toString());
    }

}
