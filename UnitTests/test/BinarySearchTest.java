import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testBinarySearchNormalCase() {
        int[] data = {1,3,5,12,15,45,66,78,345,567,789};
        boolean res = Main.binarySearch(data, 12);
        Assert.assertTrue(res);
        res = Main.binarySearch(data, 18);
        Assert.assertFalse(res);
        res = Main.binarySearch(data, 600);
        Assert.assertFalse(res);
    }

    @Test
    public void testMiddleValue() {
        int[] data = {1,3,5,12,15,45,66,78,345,567,789};
        boolean res = Main.binarySearch(data, 45);
        Assert.assertTrue(res);
    }

    @Test
    public void testFirstValue() {
        int[] data = {1,3,5,12,15,45,66,78,345,567,789};
        boolean res = Main.binarySearch(data, 1);
        Assert.assertTrue(res);
    }

    @Test
    public void testLastValue() {
        int[] data = {1,3,5,12,15,45,66,78,345,567,789};
        boolean res = Main.binarySearch(data, 789);
        Assert.assertTrue(res);
    }
    @Test
    public void testGreaterThanLastValue() {
        int[] data = {1,3,5,12,15,45,66,78,345,567,789};
        boolean res = Main.binarySearch(data, 800);
        Assert.assertFalse(res);
    }

    @Test
    public void testLessThanLastValue() {
        int[] data = {1,3,5,12,15,45,66,78,345,567,789};
        boolean res = Main.binarySearch(data, -1);
        Assert.assertFalse(res);
    }
}
