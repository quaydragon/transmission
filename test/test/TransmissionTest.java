package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import transmission.Transmission;
import transmission.AutomaticTransmission;

/**
 * A JUnit test class for 
 */
public class TransmissionTest {
  private AutomaticTransmission car;


  /**
   * 
   */
  @Before
    public void setUp() {
    car = new AutomaticTransmission(20, 35, 45, 55, 70, 0);
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
    assertEquals(0, car.getSpeed(), .0000004);
  }
  
  
  @Test
  public void testGear() {
    assertEquals(0, car.getGear(), .0000004);
  }
  
  @Test
  public void testIncreaseSpeed() {
    assertEquals(car, car.increaseSpeed());
    assertEquals(2, car.getSpeed());
  }
  
  //TODO: Need to fix for exceptions
  @Test
  public void testDecreaseSpeed() {
    assertEquals(car, car.decreaseSpeed());
    assertEquals(0, car.getSpeed());
  }
  
//  @Test(expected = IllegalArgumentException.class)
//  public void testIfInvalidDuration() {
//    WeatherReading wr = new WeatherReading(4, 38, -20, 0);
//  }
}
