package Test;

import Main.Elevator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElevatorTest {
    @Test
    public void testMoveToThirdFloorFromGroundFloor(){
        Elevator elevator=new Elevator();
        elevator.goTo(3);
        assertEquals(new Integer(3),elevator.getCurrentFloor());
    }
}