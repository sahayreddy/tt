import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/** 
 * This class is for testing the TriangleType class
 * @author csc116-003/004
 */
public class TriangleTypeTest {

    /** This test checks the scenario where the three side values are legal but do not form a valid triangle */
    @Test
    public void testIsValidTriangleInvalidTriangleSides() {
        assertFalse(TriangleType.isValidTriangle(1, 2, 1), "Invalid Sides");
    }

    /** This test checks the scenario where the three side values are equal (Equilateral) */
    @Test
    public void testGetTriangleTypeEquilateral() {
        assertEquals("equilateral", TriangleType.getTriangleType(3, 3, 3), "Equilateral Triangle");
    }

    /** Test 3: Checks the scenario where side lengths are non-positive (<= 0) */
    @Test
    public void testIsValidTriangleNonPositiveSides() {
        assertFalse(TriangleType.isValidTriangle(-1, 4, 5), "Negative side should be invalid");
        assertFalse(TriangleType.isValidTriangle(0, 4, 5), "Zero length side should be invalid");
    }

    /** Test 4: Checks the scenario where two sides are equal (Isosceles) */
    @Test
    public void testGetTriangleTypeIsosceles() {
        assertEquals("Isosceles", TriangleType.getTriangleType(5, 5, 3), "Isosceles Triangle");
    }

    /** Test 5: Checks the scenario where all three sides are distinct (Scalene) */
    @Test
    public void testGetTriangleTypeScalene() {
        assertEquals("Scalene", TriangleType.getTriangleType(3, 4, 5), "Scalene Triangle");
    }
}