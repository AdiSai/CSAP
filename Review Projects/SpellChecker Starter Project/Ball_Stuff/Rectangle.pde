class Rectangle
{
  int x;
  int y;
  int xSpeed;
  int ySpeed;
  int red;
  int blue;
  int green;
  int xSize;
  int ySize;

  public Rectangle(int x1, int y1)
  {
    x = x1;
    y = y1;
    xSpeed = (int) random(5) + 3;
    ySpeed = (int) random(5) + 3;
    red = (int) random(255);
    green = (int) random(255);
    blue = (int) random(255);
    xSize = (int) random(50) + 20;
    ySize = (int) random(50) + 20;
    
    
  }
  
  public void move()
  {
    if(xSpeed > 0 && x > width - 15)
    {
      xSpeed = xSpeed * -1;
    }
    
    if(ySpeed > 0 && y > height - 15)
    {
      ySpeed = ySpeed * -1;
    }
    
    if(xSpeed < 0 && x < 15)
    {
      xSpeed = xSpeed * -1;
    }
    
    if(ySpeed < 0 && y < 15)
    {
      ySpeed = ySpeed * -1;
    }
    
    x += xSpeed;
    
    y += ySpeed;
    
    rect(x, y, xSize, ySize);
    fill(red, green, blue);
    
    
    
  }
  

  
    
}
  
