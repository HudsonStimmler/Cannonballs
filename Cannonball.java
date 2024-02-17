public class Cannonball extends Ball{
  
  private float acc;
  
  public Cannonball(int size, float xPos, float yPos, float angle, float power){
    super(size, xPos, yPos, angle, power);
    acc = 1;
  }
  //override
  public void move(){
    super.move();
    float oldYVel = this.getYVel();
    float nextYVel = oldYVel + acc;
    this.setYVel(nextYVel);
  }
}
