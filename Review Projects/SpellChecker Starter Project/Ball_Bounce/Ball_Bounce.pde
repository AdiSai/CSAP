int width = 800;
int height = 500;
int x =100;
int y =100;
int xSpeed = 4;
int ySpeed = 3;


void setup()
{
 size(width, height);
 background(15,99,162); 
  
} 

void draw()
{
 background(15,99,162);
 fill(46,240,225);
 ellipse(x,y,60,60); 
  x = x+ xSpeed;
  y = y + ySpeed;
  if (x > width){
    xSpeed = xSpeed * -1;
  }
   if ( x < 0){
     xSpeed = Math.abs(xSpeed);
    
   }
   
  
  if ( y > height ){
    ySpeed = ySpeed * -1;
    
  }
  if ( y < 0){
    ySpeed = ySpeed * -1;
  }
} 
