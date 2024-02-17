public class Ball{
  
  private int size;
  private float xPos;
  private float yPos;
  private float xVel;
  private float yVel;
  
  public Ball(int size, float xPos, float yPos, float angle, float power){
    this.size = size;
    this.xPos = xPos;
    this.yPos = yPos;
    xVel = power * (float)Math.cos(angle);
    yVel = -power * (float)Math.sin(angle);
  }
  
  public float getX(){
    return xPos;
  }
  
  public float getY(){
    return yPos;
  }
  public int getSize(){
    return size;
  }
  
  public float getXVel(){
    return xVel;
  }
  
  public float getYVel(){
    return yVel;
  }
  
  public void setXVel(float xVel){
    this.xVel = xVel;
  }
  
  public void setYVel(float yVel){
    this.yVel = yVel;
  }
  
  public void move(){
    xPos += xVel;
    yPos += yVel;
  }
  

}
