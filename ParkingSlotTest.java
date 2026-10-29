import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MiniParkingTest{

@Test
public  void testSimpleParkingReturnParkingSlot(){
String expected = "";
int number = 20 ;
String actual = Miniparking.PackingSlot(number);
assertEquals(expected, actual);
}

@Test
public void testPackingStatusReturnPackingSlot(){
int expect = 0;
int count = 1;
int actual = MiniParking.PackingSlot(count);
assertEquals(expected, actual);

}

@Test
public void testPackingSpaceReturnPackingStatus(){
int number = 20;
boolean actual = PackingSpace.PackingStatus(number);
assertTrue(actual);
}

@Test
public void testSlotNumberReturnPackSpaces(){
 expect = "Car number";
int number = 1; 
String actual = MiniParking.PackSpaces(number);
assertEquals(expect, actual);
}

}

