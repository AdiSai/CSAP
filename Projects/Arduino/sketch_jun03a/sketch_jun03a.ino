#include "NOTES.h"
const int buttonPin = 10;
const int potPinUno = 2;
const int potPinDos = 4;
const int speakerPin = 12;
const int photocellPin = 0;

int melody[8] = {NOTE_C4, NOTE_D4, NOTE_E4, NOTE_F4, NOTE_G4, NOTE_A4, NOTE_B4, NOTE_C5};

int soundState = HIGH;         // the current state of the output pin
int buttonState;             // the current reading from the input pin
int lastButtonState = LOW;   // the previous reading from the input pin
long lastDebounceTime = 0;  // the last time the output pin was toggled
long debounceDelay = 50;    // the debounce time; increase if the output flickers

void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(buttonPin, INPUT);
}

void loop() {
  //oldLoop();
  newLoop();
}

void oldLoop() {
  // put your main code here, to run repeatedly:
int reading = analogRead(photocellPin);
int pitch = random(256) + reading / 4;
tone(speakerPin, map(analogRead(potPinDos), 0, 1023, 0, 256));
delay(100);
}

void newLoop() {
  int currButtonState = 0;
  for (int i = 0; i < sizeof(melody)/sizeof(int); i++)
  {
    currButtonState = getButtonState();
    //debounce(currButtonState);
    if (currButtonState == HIGH)
    {
      tone(speakerPin, melody[i]);
      int delayVal = analogRead(potPinUno)/2;
      Serial.print("If condition: ");
      Serial.println(delayVal);
      delay(map(delayVal * 2, 0 , 1023, 0, 500));
    }
    else { 
      tone(speakerPin, melody[random(8)]);
      int delayVal = analogRead(potPinUno)/2;
      Serial.print("Else condtion: ");
      Serial.println(delayVal);
      delay(map(delayVal * 2, 0 , 1023, 0, 500));
     }
  }
 }
  
  int getButtonState() { return digitalRead(buttonPin); }
  
  void debounce(int currButtonState) {
    if (currButtonState != lastButtonState) {
    lastDebounceTime = millis();
  } 
  if ((millis() - lastDebounceTime) > debounceDelay) {
    if (currButtonState != buttonState) {
      buttonState = currButtonState;
    }
  }
  lastButtonState = currButtonState;
  }
