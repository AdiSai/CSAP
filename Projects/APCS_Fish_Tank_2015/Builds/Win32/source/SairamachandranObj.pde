class SaiObj extends AnimatedObject
{
  color bodyColor;
  boolean visible;
  ArrayList locationsToMove;
  int transparency;
  int X;
  int y;
  int xSpeed;
  int ySpeed;
  int fishNum;
  SaiObj(int x, int y, int fishNum)
  {
    this.x = x;
    this.y = y;
    xSpeed = x;
    ySpeed = y;
    this.fishNum = fishNum;
    bodyColor = color(62, 118, 114, transparency);
    visible = true;
    transparency = 255;
    locationsToMove = new ArrayList();
  }

  void display()
  {
    if (visible)
    {
      makeShapes(fishNum);
    } else if (!(visible))
    {
      noStroke();
    }
  }
  void move()
  {
    x += xSpeed;
    y += ySpeed;
    xSpeed++;
    ySpeed++;
    if (x > width || x < 0)
    {
      xSpeed = xSpeed * -1;
    }
    if (y > height || y < 0)
    {
      ySpeed = ySpeed * -1;
    }
    if (x == width || y == height)
    {
      x = 0;
      y = 0;
    }
    x++;
    y++;
  }
  public void move(PVector[] locs)
  {
    for (PVector q : locs)
    {
      float newDist = dist(this.x, this.y, q.x, q.y);

      if ((newDist<150) && (this.x!=q.x && this.y!=q.y))
      {
        locationsToMove.add(q);
      }
    }

    if (locationsToMove.size()==0)
    {
      if (transparency<=245)
      {
        transparency+=10;
        visible=true;
      } else
      {
        transparency=255;
      }
    } else
    {
      for (int i=0; i<locationsToMove.size (); i++)
      {
        if (transparency>=10)
        {
          transparency-=10;
        } else
        {
          transparency=0;
          visible=false;
        }
      }
    }
    locationsToMove.clear();
    move();
  }
  void makeShapes(int n)
  {
    if (n == 1)
    {
      //same shape as ScaredFish
      makeASimpleFish();
    } 
    else if (n == 2)
    {
      makeAComplicatedFish();
    }
  }
  void makeASimpleFish()
  {
    fill(62, 118, 114, transparency);
    triangle(x-20, y-26, x-50, y-50, x+20, y-27);
    triangle(x-30, y+22, x-80, y+50, x+20, y+27);
    triangle(x-45, y, x-60, y+20, x-60, y+5);
    quad(x-46, y, x-65, y, x-100, y-20, x-60, y-5);
    fill(62, 118, 114, transparency);
    ellipse(x, y, 90, 60);
    fill(255, 255, 255);
    ellipse(x+18, y-7, 15, 15);
    fill(0, 0, 0);
    ellipse(x+18, y-7, 6, 6);
  }
  void makeAComplicatedFish()
  {
    noStroke();
    fill(62, 118, 114, transparency);
    //wings and fins:
    triangle(x-30, y-22, x-80, y-50, x+20, y-27);
    triangle(x-30, y+22, x-80, y+50, x+20, y+27);
    triangle(x-90, y, x-120, y+20, x-60, y+5);
    triangle(x-90, y, x-120, y-20, x+60, y-5);
    //square?:
    quad(x-46, y, x-65, y, x-100, y-20, x-60, y-5);
    fill(62, 118, 114, transparency);
    //body:
    ellipse(x, y, 200, 60);
    fill(255, 255, 255);
    //eyes:
    ellipse(x+60, y-7, 15, 15);
    fill(0, 0, 0);
    int yPos = y - 7;
    int yDir = 1;
    ellipse(x+55, yPos, 15/2, 15/2);
    yPos = yPos + yDir;
    yDir++;
  }
}

