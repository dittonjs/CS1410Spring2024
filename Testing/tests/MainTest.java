import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMath() {
        int res = Main.doMath(2,2);
        Assert.assertEquals(4, res);
    }
}
