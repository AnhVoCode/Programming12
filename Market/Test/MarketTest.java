import org.junit.Test;

import static org.junit.Assert.*;

public class MarketTest {

    @Test
    public void totalPriceTest(){
        double price = Market.Pastry.getPrice();
        assertEquals(price+price*0.05,Market.Pastry.totalPrice(Market.Pastry),0);

    }


}