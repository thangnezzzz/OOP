import junit.framework.TestCase;

public class TestTrainTrip extends TestCase {
    public void testConstructor(){
        Route r = new Route("New York","Boston");
        Clocktime d = new Clocktime(23,50);
        Clocktime a = new Clocktime(13,20);
        Schedule s = new Schedule (d,a);
        TrainTrip t1 = new TrainTrip(r,s,true);

        r = new Route ("Chicago", "New York");
        d = new Clocktime(10,34);
        a = new Clocktime(13,18);
        s = new Schedule(d,a);
        TrainTrip t2 = new TrainTrip(r,s,true);
    }
}
