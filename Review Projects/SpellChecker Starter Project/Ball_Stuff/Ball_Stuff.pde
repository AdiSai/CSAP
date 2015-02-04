ClassyBall bBall;
ClassyBall[] multBalls;
Rectangle[] multRect;


void setup()
{
  size(800, 800);
  background(246, 255, 5);
   bBall = new ClassyBall(343, 45);
   multBalls= new ClassyBall[50];
   multRect = new Rectangle[30];
   for(int i = 0; i < multBalls.length; i++)
   {
     multBalls[i] = new ClassyBall((int) random(width), (int) random(width));
   }
   for(int j = 0; j < multRect.length; j++)
   {
     multRect[j] = new Rectangle((int) random(width), (int) random(height));
   }
}

void draw()
{
  background(246, 255, 5);
  bBall.move();
  
  for( ClassyBall ball : multBalls)
  {
    
    
    ball.move();
    
    
  }
  
  
  for( Rectangle recty : multRect)
  {
    recty.move();
  }
   
  
}
