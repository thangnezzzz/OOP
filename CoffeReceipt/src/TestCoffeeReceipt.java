import junit.framework.TestCase;

public class TestCoffeeReceipt extends TestCase {
    public void testConstructor() {
        new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
        new CoffeeReceipt("Ethiopian", 8.00, 100);
        new CoffeeReceipt("Colombian Supreme", 9.50, 1700);
    }
        public void testSellingCost() {
            CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);

            assertEquals(1595.00, hk.sellingCost(), 0.001);//0.00

            CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);

            assertEquals(8000.00, e.sellingCost(), 0.001);

            CoffeeReceipt cs = new CoffeeReceipt("Colombian Supreme", 9.50, 1700);

            assertEquals(16150.00, cs.sellingCost(), 0.001);

        }
        public void testWeighsMore(){
        assertFalse(new CoffeeReceipt("Hawaiian Kona",15.95,100).weighsMore(200));
        assertFalse(new CoffeeReceipt("Ethiopian",8.00,1000).weighsMore(1000));
        assertTrue(new CoffeeReceipt("Columbian",9.50,200).weighsMore(100));
        }
        public void testlsCheaperThan(){
        assertTrue(new CoffeeReceipt("Hawaiian Kona", 15.95, 100).isCheaperThan(new CoffeeReceipt("Hawaiian Kona",20.00, 100)));
        assertFalse(new CoffeeReceipt("Ethiopian", 15.95, 200).isCheaperThan(new CoffeeReceipt("Ethiopian", 15.95,100)));
        assertFalse(new CoffeeReceipt("Columbian", 9.50, 300).isCheaperThan(new CoffeeReceipt("Columbian", 8.00, 100)));
        }
        public void testCostLessThan() {
            CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
            CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);
            CoffeeReceipt cs = new CoffeeReceipt("Columbian", 9.50, 1700);
            assertTrue(hk.costLessThan(e));
            assertFalse(e.costLessThan(e));
            assertFalse(cs.costLessThan(e));
        }
    }

     