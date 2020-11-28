import org.junit.*;
import static org.junit.Assert.*;

public class UnsafeTest {

    @Test
    public void testGarbage(){
        TotallyNormalClassNothingSuspiciousGoingOnHere myClass = new TotallyNormalClassNothingSuspiciousGoingOnHere();

        assertEquals("1-1=0", 0, myClass.add(1,1));
        assertEquals("1+1=2", 2, 1+1);
    }
}
