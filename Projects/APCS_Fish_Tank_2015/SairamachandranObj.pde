import ddf.minim.*;
class SaiObj extends AnimatedObject
{
//  Minim m = new Minim(this);
//  AudioPlayer adiFishySound;  
  color bodyColor;
  boolean visible;
  ArrayList locationsToMove;
  int transparency;
  int X;
  int y;
  SaiObj(int x, int y)
  {
    this.x = x;
    this.y = y;
    bodyColor = color(62, 118, 114,transparency);
    visible = true;
    transparency = 255;
    locationsToMove = new ArrayList();
  }
  
  void display()
  {
    //playSound();
    if (visible)
    {
      makeShapes(3);
    }
    else if (!(visible))
    {
      noStroke();
    }
  }
  void move()
  {
    x+= 2;
    y+= 2;
    if (x == width || y == height)
    {
      x = 0;
      y = 0;
    }
  }
  public void move(PVector[] locs)
  {
    for(PVector q: locs)
    {
      float newDist = dist(this.x,this.y,q.x,q.y);
      
      if((newDist<150) && (this.x!=q.x && this.y!=q.y))
      {
        locationsToMove.add(q);
      }
    }
    
    if(locationsToMove.size()==0)
    {
      if(transparency<=245)
      {
        transparency+=10;
        visible=true;
      }
      else
      {
        transparency=255;
      }
    }
    else
    {
      for(int i=0; i<locationsToMove.size(); i++)
      {
        if(transparency>=10)
        {
          transparency-=10;
        }
        else
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
      fill(62, 118, 114, transparency);
      triangle(x-20,y-26,x-50,y-50,x+20,y-27);
      triangle(x-30,y+22,x-80,y+50,x+20,y+27);
      triangle(x-45,y,x-60,y+20,x-60,y+5);
      quad(x-46,y,x-65,y,x-100,y-20,x-60,y-5);
      fill(62, 118, 114, transparency);
      ellipse(x,y,90,60);
      fill(255,255,255);
      ellipse(x+18,y-7,15,15);
      fill(0,0,0);
      ellipse(x+18,y-7,6,6);
    }
    else if (n == 2)
    {
      makeAPenguin(); //from http://www.openprocessing.org/sketch/79038
    }
    else if (n ==3)
    {
      fill(62, 118, 114, transparency);
      triangle(x-40,y-40,x-50,y-50,x+20,y-27);
      triangle(x-30,y+22,x-80,y+50,x+20,y+27);
      triangle(x-90,y,x-120,y+20,x-60,y+5);
      quad(x-46,y,x-65,y,x-100,y-20,x-60,y-5);
      fill(62, 118, 114, transparency);
      ellipse(x,y,200,60);
      fill(255,255,255);
      ellipse(x+10,y-7,15,15);
      fill(0,0,0);
      ellipse(x+10,y-7,6,6);
    }
  }
  void makeAPenguin()
  {
    //noStroke();
    ellipseMode(CENTER);
    fill(0);
    ellipse(X,y-50,60,60); //Draw the penguins head 
    ellipse(X,y,70,90); //Draw the penguins body  
    fill(255);
    ellipse(X-10,y-50,20,20); //Draw left eye
    ellipse(X+10,y-50,20,20); //Darw right eye 
    ellipse(X,y+2,50,70); //Draw penguins body
    fill(0);
    ellipse(X-8,y-50,10,10); //Draw left pupil
    ellipse(X+8,y-50,10,10); //Draw right pupil
    fill(230,255,0);
    ellipse(X,y-38,25,18); //Draw the penguins beak
    ellipse(X-15,y+45,25,15); //Draw penguins left foot
    ellipse(X+15,y+45,25,15); //Draw penguins right foot
 }
//  void playSound()
//  {
//    adiFishySound = m.loadFile("adiFishy.wav");
//    adiFishySound.play();
//  }
}
