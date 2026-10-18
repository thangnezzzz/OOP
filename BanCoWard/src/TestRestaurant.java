import junit.framework.TestCase;

public class TestRestaurant extends TestCase {
    public void testConstructor(){
        Intersection i1 = new Intersection(7,65);
        Restaurant r1 = new Restaurant (" La Crepe", "French food", "moderate",i1);
        Intersection i2 = new Intersection (2,86);
        Restaurant r2 = new Restaurant ("Bremen Haus", "German food", "moderate", i2);
        Intersection i3 = new Intersection(10,113);
        Restaurant r3= new Restaurant("Moon Palace","Chinese food", "inexpensive", i3);
    }
}
