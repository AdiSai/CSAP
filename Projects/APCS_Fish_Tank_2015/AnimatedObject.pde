/** An abstract class for animated objects */
abstract class AnimatedObject {

  float x;
  float y;
  //Constructors??

  abstract void display(); //method used to draw object on screen.

  //move() will advance object by one frame, but ignores locations of other objects in 
  //fish tank.
  
  void move() {
  }

  //move(PVector []) will advance object by one frame, but has an array, locs, with
  //the location of each of the other object's locations stored as a PVector
  
  void move(PVector[] locs) { 
    move();
  }

  //accessor method returning obj's x position
  float getX()
  {
      return x;
  }

  //accessor method returning obj's y position
  
  float getY()
  {
      return y;
  }
  
}
