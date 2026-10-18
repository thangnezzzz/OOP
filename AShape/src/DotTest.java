import junit.framework.TestCase;

public class DotTest extends TestCase {
    public void testConstructor(){
        new Dot(new CartesianPoint(100,200));
        CartesianPoint location = new CartesianPoint(100,200);
        new Dot(location);
    }
}
