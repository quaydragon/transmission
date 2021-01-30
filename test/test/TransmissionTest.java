package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import transmission.AutomaticTransmission;

/**
 * A JUnit test class for AutomaticTransmission.
 */
public class TransmissionTest {
  private AutomaticTransmission car;
  private AutomaticTransmission stoppedCar;



  /**
   * Set up methods before test. 
   */
  @Before
    public void setUp() {
    car = new AutomaticTransmission(20, 35, 45, 55, 70, 10);
    stoppedCar = new AutomaticTransmission(20, 35, 45, 55, 70, 0);
  }



  @Test
  public void testThresholdOne() {
    assertEquals(20, car.getThresholdOne(), .0000004);
  }
  
  
  @Test
  public void testThresholdTwo() {
    assertEquals(35, car.getThresholdTwo(), .0000004);
  }
  
  @Test
  public void testThresholdThree() {
    assertEquals(45, car.getThresholdThree(), .0000004);
  }
  
  
  @Test
  public void testThresholdFour() {
    assertEquals(55, car.getThresholdFour(), .0000004);
  }
  
  
  @Test
  public void testThresholdFive() {
    assertEquals(70, car.getThresholdFive(), .0000004);
  }
  
  @Test
  public void testSpeed() {
    assertEquals(10, car.getSpeed(), .0000004);
  }
  
  
  @Test
  public void testGear() {
    assertEquals(1, car.getGear(), .0000004);
  }
  
  @Test
  public void testIncreaseSpeed() {
    assertEquals(car, car.increaseSpeed());
    assertEquals(12, car.getSpeed());
  }
  
  @Test
  public void testDecreaseSpeed() {
    assertEquals(car, car.decreaseSpeed());
    assertEquals(8, car.getSpeed());
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testIfInvalidThresholdOne() {
    new AutomaticTransmission(100, 5, 6, 7, 8, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testIfInvalidThresholdTwo() {
    new AutomaticTransmission(1, 0, 2, 3, 4, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testIfInvalidThresholdThree() {
    new AutomaticTransmission(1, 2, 0, 3, 4, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testIfInvalidThresholdFour() {
    new AutomaticTransmission(1, 2, 3, 0, 4, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testIfInvalidThresholdFive() {
    new AutomaticTransmission(1, 5, 6, 7, 0, 2);
  }
  
  
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeThresholdOne() {
    new AutomaticTransmission(-1, 5, 6, 7, 10, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeThresholdTwo() {
    new AutomaticTransmission(1, -5, 6, 7, 10, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeThresholdThree() {
    new AutomaticTransmission(1, 5, -6, 7, 10, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeThresholdFour() {
    new AutomaticTransmission(1, 5, 6, -7, 10, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeThresholdFive() {
    new AutomaticTransmission(1, 5, 6, 7, -10, 2);
  }
  
  
  @Test(expected = IllegalStateException.class)
  public void testNegativeSpeed() {
    stoppedCar.decreaseSpeed();
  }
  
  @Test
  public void testToString() {
    assertEquals("Transmission (speed = 10, gear = 1)", car.toString());
  }
  
}
