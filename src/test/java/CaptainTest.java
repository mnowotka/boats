import junit.framework.TestCase;

public class CaptainTest extends TestCase {

    public void testSingleton(){
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}