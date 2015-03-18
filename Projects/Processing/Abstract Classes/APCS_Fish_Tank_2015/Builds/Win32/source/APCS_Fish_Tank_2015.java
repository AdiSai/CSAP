import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.ArrayList; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class APCS_Fish_Tank_2015 extends PApplet {

PImage g;
ArrayList<AnimatedObject> objs = new ArrayList<AnimatedObject>();

int SAND_HEIGHT = 120;

public void setup() {
  g = loadImage("Google.jpg");
  size(g.width,g.height);
  smooth();
  
  Seahorse s = new Seahorse();
  objs.add(s);
  
  ScaredFish greeny = new ScaredFish(20,40);
  objs.add(greeny);
  
  StarFish still = new StarFish(random(40,70));
  objs.add(still);

  SaiObj adiFish = new SaiObj(5, 5, 2);
  objs.add(adiFish);
  
  //add your object here
  
}


//DO NOT CHANGE CODE BELOW!!!!!!!
//DO NOT CHANGE CODE BELOW!!!!!!!
//DO NOT CHANGE CODE BELOW!!!!!!!
//DO NOT CHANGE CODE BELOW!!!!!!!
//EVER. PERIOD. END OF STORY.
public void draw() {
    
  drawTankBackground();                    
 
  PVector[] locations = new PVector[objs.size()];
  for (int i=0; i<objs.size(); i++) {
      AnimatedObject obj = objs.get(i);
      locations[i] = new PVector(obj.getX(), obj.getY());
  }

  for (AnimatedObject ao: objs) {
      ao.display();
      ao.move(locations);
      resetMatrix();           
    }
  
}

public void drawTankBackground() {
    
  rectMode(CORNER);
  tint(0,130,237);
  image(g,0,0,displayWidth,displayHeight);
  //background(50, 50, 255);
  int topColor = color(168, 168, 50);
  int bottomColor = color(68,68,0);
  float rDiff = red(topColor) - red(bottomColor);
  float gDiff = green(topColor) - green(bottomColor);
  float bDiff = blue(topColor) - blue(bottomColor);
  rDiff /= SAND_HEIGHT;
  gDiff /= SAND_HEIGHT;
  bDiff /= SAND_HEIGHT;
  for(int i =0; i<SAND_HEIGHT; i++)
  {
      stroke(red(topColor)-i*rDiff,green(topColor)-i*gDiff, blue(topColor)-i*bDiff);
      line(0, height-SAND_HEIGHT+i, width, height-SAND_HEIGHT+i);
  }
//  rect(0, height-SAND_HEIGHT, width, SAND_HEIGHT);    //sandy bottom
  //castle
  pushMatrix();
  translate(0,167);
  stroke (0);
  strokeWeight (1);
  fill (142, 137, 137,200);
  rectMode (CORNER);
  //botton part of castle
  rect (10, 390-80, 200, 170);
  //middle part of castle
  rect (30, 300-80, 160, 90);
  //top part of castle
  rect (50, 250-80, 120, 50);
  //castle flag
  strokeWeight (2);
  line (110, 250-80, 110, 210-80);
  fill (255, 0, 0,127);
  triangle (110, 210-80, 110, 230-80, 130, 220-80);
  //castle door
  noStroke ();
  fill (109, 190, 250,127);
  rect (90, 490-80, 40, 70);
  ellipseMode (CENTER);
  arc (110, 490-80, 40, 40,PI,2*PI);
  //castle windows
  stroke (0);
  rect (130, 330-80, 30, 30);
  line (145, 330-80, 145, 360-80);
  line (130, 345-80, 160, 345-80); 
  rect (60, 330-80, 30, 30);
  line (75, 330-80, 75, 360-80);
  line (60, 345-80, 90, 345-80);
  popMatrix();
}


/** An abstract class for animated objects */
abstract class AnimatedObject {

  float x;
  float y;
  //Constructors??

  public abstract void display(); //method used to draw object on screen.

  //move() will advance object by one frame, but ignores locations of other objects in 
  //fish tank.
  
  public void move() {
  }

  //move(PVector []) will advance object by one frame, but has an array, locs, with
  //the location of each of the other object's locations stored as a PVector
  
  public void move(PVector[] locs) { 
    move();
  }

  //accessor method returning obj's x position
  public float getX()
  {
      return x;
  }

  //accessor method returning obj's y position
  
  public float getY()
  {
      return y;
  }
  
}
class SaiObj extends AnimatedObject
{
  int bodyColor;
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

  public void display()
  {
    if (visible)
    {
      makeShapes(fishNum);
    } else if (!(visible))
    {
      noStroke();
    }
  }
  public void move()
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
  public void makeShapes(int n)
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
  public void makeASimpleFish()
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
  public void makeAComplicatedFish()
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



public class ScaredFish extends AnimatedObject
{
  private boolean isBottom;
  private boolean isRight;
  private int transparency;
  private boolean invisible;
  private ArrayList newLocs;
  //private boolean hasChanged;
  
  public ScaredFish(int x, int y)
  {
    this.x=x;
    this.y=y;
    isBottom=true;
    isRight=true;
    transparency=255;
    invisible=false;
    //hasChanged=false;
    newLocs = new ArrayList();
  }
  
  public void display()
  {
    if(invisible)
    {
      noStroke();
    }
    else
    {
      stroke(66/2,232/2,2/2);
    }
    
    if(isRight)
    {
      fill(66,232,2,transparency);
      triangle(x-20,y-26,x-50,y-50,x+20,y-27);
      triangle(x-30,y+22,x-80,y+50,x+20,y+27);
      triangle(x-45,y,x-60,y+20,x-60,y+5);
      quad(x-46,y,x-65,y,x-100,y-20,x-60,y-5);
      fill(66,232,2,transparency);
      ellipse(x,y,90,60);
      fill(255,255,255);
      ellipse(x+18,y-7,15,15);
      fill(0,0,0);
      ellipse(x+18,y-7,6,6);
    }
    
    
    if(isRight==false)
    {
      fill(66,232,2,transparency);
      triangle(x+20,y-26,x+50,y-50,x-20,y-27);
      triangle(x+30,y+22,x+80,y+50,x-20,y+27);
      triangle(x+45,y,x+60,y+20,x+60,y+5);
      quad(x+46,y,x+65,y,x+100,y-20,x+60,y-5);
      fill(66,232,2,transparency);
      ellipse(x,y,90,60);
      fill(255,255,255);
      ellipse(x-18,y-7,15,15);
      fill(0,0,0);
      ellipse(x-18,y-7,6,6);
    }
  }
  
  public void move()
  {
    if(isRight)
    {
      x++;
      if(x==955)
      {
        isRight=false;
      }
    }
    else
    {
      x--;
      if(x==45)
      {
        isRight=true;
      }
    }
    if(isBottom)
    {
      y++;
      if(y==570)
      {
        isBottom=false;
      }
    }
    else
    {
      y--;
      if(y==30)
      {
        isBottom=true;
      }
    }
  }
  
  public void move(PVector[] locs)
  {
    for(PVector q: locs)
    {
      float newDist = dist(this.x,this.y,q.x,q.y);
      
      if((newDist<150) && (this.x!=q.x && this.y!=q.y))
      {
        newLocs.add(q);
      }
    }
    
    if(newLocs.size()==0)
    {
      if(transparency<=245)
      {
        transparency+=10;
        invisible=false;
      }
      else
      {
        transparency=255;
      }
    }
    else
    {
      for(int i=0; i<newLocs.size(); i++)
      {
        if(transparency>=10)
        {
          transparency-=10;
        }
        else
        {
          transparency=0;
          invisible=true;
        }
      }
    }
    newLocs.clear();
    
    move();
  }

}
//Create by Adam Elansari
//Distributed for educational purposes only

class Seahorse extends AnimatedObject
{
    PVector v1;
    PVector horsea;
    float swimX, swimY;
    float wingRot;
    float wingSpd;
    float speedX;
    float speedY;
    float startX;
    int bodycolor;
    int strokeColor;

    Seahorse()
    {
        x=width/2;
        y=height/2;
        v1 = new PVector(width/2, height/2);
        bodycolor = color(252, 3, 40);
        strokeColor = color(79, 7, 162);
        swimX =.90f;
        swimY =.25f; 
        speedX = 10.0f;
        speedY = 1;
        wingSpd = speedY;
    }


    public void display()
    {
        pushMatrix();
        translate(swimX, swimY);
        
        fill(255);
        ellipse(v1.x,v1.y,20,20);

        smooth();

        strokeWeight(4);
        smooth();
        stroke(strokeColor);
        fill(bodycolor);
        rect(v1.x, v1.y, 60, 20);
        ellipse(v1.x, v1.y, 75, 75);
        noStroke();
        fill(255);
        ellipse(v1.x+20, v1.y, 30, 40);
        fill(255, 0, 0);
        ellipse(v1.x+25, v1.y, 20, 30);
        fill(0);
        ellipse(v1.x+30, v1.y, 10, 20);
        fill(0);
        noStroke();
        ellipse(v1.x+60, v1.y+10, 10, 15);
        //horsea's head fins
        fill(bodycolor);
        stroke(strokeColor);
        pushMatrix();
        translate(v1.x-500, v1.y-55);
        rotate(radians(330));
        //arc(v1.x, v1.y, 142, 14, 1.876, 4.421);
        popMatrix();
        arc(v1.x, v1.y, 142, 14, 1.876f, 4.421f);
        pushMatrix();
        translate(255, -205);
        rotate(radians(30));
        arc(v1.x, v1.y, 142, 14, 1.876f, 4.421f);
        popMatrix();
        //body
        bezier(v1.x-10, v1.y+40, v1.x, v1.y+200, v1.x+90, v1.y+65, v1.x+10, v1.y+40);
        //wing
        translate(v1.x+15, v1.y+120);
        strokeWeight(2);
        beginShape();
        for (int i=0;i<20;i++) 
        {
            curveVertex((i*2)*sin(i/-2.0f), (i*2)*cos(i/-2.0f));
        }
        endShape();
        wing(50, -50);
        popMatrix();

        stroke(0);
    }


    public void wing(float x, float y) 
    {
        pushMatrix();
        translate(x, y);
        wingRot += wingSpd;
        if (wingRot>5) 
        {
            wingRot = 5;
            wingSpd *=-1;
        }
        else if (wingRot < -5) 
        {
            wingRot = -5;
            wingSpd *=-1;
        }
        rotate(radians(wingRot));
        fill(19, 115, 229);
        noStroke();
        arc(-60, 0, 100, 60, 3*PI/4, 5*PI/4);
        popMatrix();
    }

    public void move(PVector[] locs)
    { 

        swimX += speedX;
        if (swimX > width)
        {
            swimX *= -1;
        }
        else if (swimX < -width)
        {
            swimX *= -1;
        }
        x = width/2 + swimX;
    }  
}

class StarFish extends AnimatedObject
{
    float s;
    float ratio;
    
    StarFish(float sze)
    {
        x = random(width);
        y = random(height-70);
        s = sze;
        ratio = sze / 55;  // (30 + 70) / 2
        
    }
    
    public void display()
    {
        pushMatrix();
        translate(x,y);
        rotate(-PI/2);
        stroke(0);
        strokeWeight(5);
        fill(255,127,127);
        beginShape();
        float spin = 2 * PI / 10;
        for(float theta =0; theta<2*PI; theta += 2*PI/5)
        {
            vertex(cos(theta) * s,sin(theta) * s);
            vertex(cos(theta+spin) * (s * 0.60f) ,sin(theta+spin) * (s *.60f));
        }
        endShape(CLOSE);
        
        popMatrix();       
        
        pushMatrix();
        translate(x,y);
       
        line(-ratio*10, 0, -ratio*10, -s/2.5f); 
        line(ratio*10, 0, ratio*10, -s/2.5f); 
        arc(0,0,s,s/4,0,PI);
        popMatrix();
    }
    
    public void move()
    {
    }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "APCS_Fish_Tank_2015" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
