int motorPin = 9;
int lightPins[3] = {11, 12, 13}; //11 r, 12 g, 13 b)
int waitTime = 100;
void setup() {
  // put your setup code here, to run once:
pinMode(motorPin, OUTPUT);
for (int i = 0; i < sizeof(lightPins)/sizeof(int); i++)
{
  pinMode(lightPins[i], OUTPUT);
}
}

void loop() {
  // put your main code here, to run repeatedly:
motorAcceleration(waitTime);
loopThroughColorsForwards(waitTime, 204, 0, 0);
delay(waitTime);
motorDeceleration(waitTime);
loopThroughColorsBackwords(waitTime, 204, 0, 0);
}

void motorAcceleration(int delayTm){
  //@param delayTm - delay time in MS
  int delayTime = delayTm; //ms between each speed step
  if (delayTime % 10 != 0) { delayTime = 100; } //set to default if delayTime is not divisible by 10 evenly
  //Accelerates the motor from speed 0 to 255
  for(int i = 0; i < 256; i++){ //goes through each speed from 0 to 255
    analogWrite(motorPin, i); //sets the new speed
    delay(delayTime / 10); // waits for delayTime ms
  }
 }
  
void motorDeceleration(int delayTm) {
  //@param delayTm - delay time in MS
  int delayTime = delayTm; //ms between each speed step
  if (delayTime % 10 != 0) { delayTime = 100; } //set to default if delayTime is not divisible by 10 evenly
  //Decelerates the motor from speed 255 to 0
  for(int i = 255; i >= 0; i--){ //goes through each speed from 255 to 0
    analogWrite(motorPin, i); //sets the new speed
    delay(delayTime / 10); // waits for delayTime ms
  }
 }
 
 void loopThroughColorsForwards(int delayTm, int r, int g, int b) {
   //@param delayTm - delay time in MS
   int delayTime = delayTm; //ms between each speed step
   if (delayTime % 10 != 0) { delayTime = 100; } //set to default if delayTime is not divisible by 10 evenly
   for (int i = 0; i < 255; i++)
   {
     analogWrite(11, r);
     analogWrite(12, g);
     analogWrite(13, b);
   }
   delay(delayTm);
   for (int i = 255; i >= 0; i--)
   {
     analogWrite(11, r);
     analogWrite(12, g);
     analogWrite(13, b);
   }
 }
 
  void loopThroughColorsBackwords(int delayTm, int r, int g, int b) {
   //@param delayTm - delay time in MS
   int delayTime = delayTm; //ms between each speed step
   if (delayTime % 10 != 0) { delayTime = 100; } //set to default if delayTime is not divisible by 10 evenly
   for (int i = 255; i >= 0; i--)
   {
     analogWrite(11, r);
     analogWrite(12, g);
     analogWrite(13, b);
   }
   delay(delayTm);
   for (int i = 0; i < 255; i++)
   {
     analogWrite(11, r);
     analogWrite(12, g);
     analogWrite(13, b);
   }
 }



