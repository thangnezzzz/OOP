import junit.framework.TestCase;

public class SquareTest extends TestCase {
    public void testConstructor(){
        new Square(new CartesianPoint(30,60),30);
        CartesianPoint location = new CartesianPoint(30,60);
        new Square(location,30);
    }
}
