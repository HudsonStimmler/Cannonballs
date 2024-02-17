public class BouncingBall extends Cannonball{
  public BouncingBall(int size, float xPos, float yPos, float angle, float power){
    super(size, xPos, yPos, angle, power);
  }
  
  //call this when the ball is supposed to bounce
  public void bounce(){
    float oldYVel = this.getYVel();
    this.setYVel((float)-0.75 * oldYVel);
  }
}
