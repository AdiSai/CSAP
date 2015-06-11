#include "NOTES.h"
#include <stdlib.h>;

const int photocellPin = 0;
const int pot1 = 2; //potentiometer 1
const int motorPin1 = 6; //motor 1
const int lightPins1[3] = {8, 9, 10}; //8 r, 9 g, 10 b)
const int speakerPin = 12;
const int finalDelayTime = 10;
const int melody[8] = {NOTE_C4, NOTE_D4, NOTE_E4, NOTE_F4, NOTE_G4, NOTE_A4, NOTE_B4, NOTE_C5};
void setup() {
  pinMode(motorPin1, OUTPUT);
  for (int i = 0; i < sizeof(lightPins1) / sizeof(int); i++)
  {
    pinMode(lightPins1[i], OUTPUT);
  }
  Serial.begin(9600);
}

void loop() {
  systemUno(finalDelayTime); //pot1, motor1, light1
}

void systemUno(int delayTime) {
  int currReading = getReading(pot1);
  Serial.println(currReading);
  while (currReading < 800) { //initial reading
    runMotorUpAndDown(motorPin1, finalDelayTime);
    currReading = getReading(pot1); //get next reading
    Serial.println(currReading);
  }
  while (currReading > 800 && currReading < 1000) {
    soundSystem(finalDelayTime);
    currReading = getReading(pot1); //get next reading
    Serial.println(currReading);
  }
runLightsInPinSet1(finalDelayTime);
}

void runMotorUpAndDown(int motorPin, int delayTime) {
  if ((!(motorPin == motorPin1)))
  {
    exit(EXIT_FAILURE);
  }
  for (int i = 0; i < 128; i++) { //goes through each speed from 0 to 255
    analogWrite(motorPin1, i);
    delay(delayTime);
  }
  delay(delayTime * 10);
  for (int i = 128; i >= 0; i--) {
    analogWrite(motorPin1, i);
    delay(delayTime);
  }
  delay((delayTime * 10)*2);
  exit(0);
}

void runLightsInPinSet1(int delayTime) {
  analogWrite(lightPins1[0], random(256));
  analogWrite(lightPins1[1], random(256));
  analogWrite(lightPins1[2], random(256));
  delay(delayTime * 10);
}

void soundSystem(int delayTime) {
  int reading = analogRead(photocellPin);
  int pitch = random(256) + reading / 4;
  tone(speakerPin, melody[random(8)]);
  delay(delayTime * 10);
}

int getReading(int potNum) {
  if (!(potNum == pot1)) {
    return 0;
  }
  return analogRead(potNum);
}
