package transmission;

/**
 * This class represents an automatic transmission.
 * @author quaydragon
 *
 */
public class AutomaticTransmission implements Transmission {
  private final int thresholdOne;
  private final int thresholdTwo;
  private final int thresholdThree;
  private final int thresholdFour;
  private final int thresholdFive;
  private int speed;
  private int gear;


  /**
  * Constructs an automatic transmission.
  * 
  * @param thresholdOne the 1st speed threshold switching from 1st to 2nd gear
  * @param thresholdTwo the 2nd speed threshold switching from 2nd to 3rd gear
  * @param thresholdThree the 3rd speed threshold switching from 3rd to 4th gear
  * @param thresholdFour the 4th speed threshold switching from 4th to 5th gear
  * @param thresholdFive the 5th speed threshold switching from 5th to 6th gear
  */
  public AutomaticTransmission(int thresholdOne, 
          int thresholdTwo, 
          int thresholdThree, 
          int thresholdFour, 
          int thresholdFive,
          int speed) throws IllegalArgumentException {  
      
    if ((thresholdOne > thresholdTwo) 
           ||  (thresholdTwo > thresholdThree) 
           || (thresholdThree > thresholdFour) 
           || (thresholdFour > thresholdFive) 
           || (speed < 0)
           || (thresholdOne < 0)
           || (thresholdTwo < 0)
           || (thresholdThree < 0)
           || (thresholdFour < 0)
           || (thresholdFive < 0)) {
      throw new IllegalArgumentException("Thresholds must increase. \n "
                        + "Speed must not be less than 0.");
    }
    this.thresholdOne = thresholdOne;
    this.thresholdTwo = thresholdTwo;
    this.thresholdThree = thresholdThree;
    this.thresholdFour = thresholdFour;
    this.thresholdFive = thresholdFive;
    this.speed = speed;
    this.gear = this.gearDetermination();
      
  }
  
  
  /**
   * Return the 1st threshold of the automatic transmission.
   * 
   * @return the 1st threshold of the automatic transmission
   */
  public int getThresholdOne() {
    return this.thresholdOne;
  }
  
  /**
  * Return the 2nd threshold of the automatic transmission.
  * 
  * @return the 2nd threshold of the automatic transmission
  */
  public int getThresholdTwo() {
    return this.thresholdTwo;
  }
  
  
  /**
  * Return the 3rd threshold of the automatic transmission.
  * 
  * @return the 3rd threshold of the automatic transmission
  */
  public int getThresholdThree() {
    return this.thresholdThree;
  }
  
  /**
  * Return the 4th threshold of the automatic transmission.
  * 
  * @return the 4th threshold of the automatic transmission
  */
  public int getThresholdFour() {
    return this.thresholdFour;
  }
  
  /**
  * Return the 5th threshold of the automatic transmission.
  * 
  * @return the 5th threshold of the automatic transmission
  */
  public int getThresholdFive() {
    return this.thresholdFive;
  }
  
  /**
  * Return the speed the car is traveling.
  * 
  * @return the speed the car is traveling
  */
  public int getSpeed() {
    return this.speed;
  }
  
  /**
  * Return the gear the transmission is in.
  * 
  * @return the gear the transmission is in
  */
  public int getGear() {
    return this.gear;
  }
  
  
  /**
   * Returns overrode toString() method with the transmissions gear and speed.
   * 
   * @return string containing the transmission's speed and gear
   */
  @Override
  public String toString() {
    String gearSpeed = String.format("Transmission (speed = %d, gear = %d)", this.speed, this.gear);
    return gearSpeed;
  }

  
  /**
  * Return the gear from the speed initialized originally.
  * 
  * @return the gear the transmission is in
  */
  private int gearDetermination() {
    int speed = this.speed;
    int gear;
      
    if (speed == 0) {
      gear = 0;
    } else if (speed < this.thresholdOne) {
      gear = 1;
    } else if (speed < this.thresholdTwo) {
      gear = 2;
    } else if (speed < this.thresholdThree) {
      gear = 3;
    } else if (speed < this.thresholdFour) {
      gear = 4;
    } else if (speed < this.thresholdFive) {
      gear = 5;
    } else if (speed >= this.thresholdFive) {
      gear = 6;
    } else {
      gear = 0;   
    }
    return gear; 
  }
  
  
  

  /**
   * Return the automatic transmission object with +2 speed.
   * 
   * @return the automatic transmission object 
   */
  public AutomaticTransmission increaseSpeed() {
    this.speed += 2;
    this.gear = this.gearDetermination();
    return this;
  }
  
  
  
  /**
   * Return the automatic transmission object with -2 speed.
   * @return
   */
  public AutomaticTransmission decreaseSpeed() throws IllegalArgumentException {
    if (this.speed == 0) {
      throw new IllegalStateException("Car is already stopped!");    
    }
    System.out.println(this.speed);
    this.speed -= 2;
    this.gear = this.gearDetermination();
    return this;
      
  }
  





}
