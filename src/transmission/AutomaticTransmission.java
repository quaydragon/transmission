package transmission;

/**
 * This class 
 * @author quaydragon
 *
 */
public class AutomaticTransmission implements Transmission {
  //TODO: This class automatically determines current gear by current speed
  private final int thresholdOne;
  private final int thresholdTwo;
  private final int thresholdThree;
  private final int thresholdFour;
  private final int thresholdFive;
  private int speed;
  private int gear;
//  private final int gear = 0;

/**
 * 
 * @param thresholdOne
 * @param thresholdTwo
 * @param thresholdThree
 * @param thresholdFour
 * @param thresholdFive
 */
  public AutomaticTransmission(int thresholdOne, 
          int thresholdTwo, 
          int thresholdThree, 
          int thresholdFour, 
          int thresholdFive,
          int speed) {      
    this.thresholdOne = thresholdOne;
    this.thresholdTwo = thresholdTwo;
    this.thresholdThree = thresholdThree;
    this.thresholdFour = thresholdFour;
    this.thresholdFive = thresholdFive;
    this.speed = speed;
    this.gear = this.gearDetermination();
      
  }
  
  //TODO: make illegal argument exception
  
  
  // TODO: Make Javadocs
  
  public int getThresholdOne() {
    return this.thresholdOne;
  }
  
  public int getThresholdTwo() {
    return this.thresholdTwo;
  }
  
  public int getThresholdThree() {
    return this.thresholdThree;
  }
  
  public int getThresholdFour() {
    return this.thresholdFour;
  }
  
  public int getThresholdFive() {
    return this.thresholdFive;
  }
  
  public int getSpeed() {
    return this.speed;
  }
  
  public int getGear() {
    return this.gear;
  }
  
  
  //TODO: Create the toString() override method
  
  
  //TODO: Write gear determination javadox
  
  
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
  
  
  
  //TODO: Increase Speed method
  
  //make certain it cannot go above threshold
  
  public AutomaticTransmission increaseSpeed() {
    this.speed += 2;
    this.gear = this.gearDetermination();
    return this;
  }
  
  
  //TODO: Decrease Speed method
  //make an illegal state exception if speed goes below 0
  
  
  
  public AutomaticTransmission decreaseSpeed() {
    //TODO: throw that exception right back if there is a mutha fn issue
    this.speed -= 2;
    this.gear = this.gearDetermination();
    return this;
      
  }
  





}
