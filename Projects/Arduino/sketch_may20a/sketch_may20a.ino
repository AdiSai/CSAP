void setup() {
  // put your setup code here, to run once:
pinMode(9, OUTPUT);
}

void loop() {
// put your main code here, to run repeatedly:
digitalWrite(9, HIGH);
delay(1000);
for (int digital = 0; digital < 2147483647; digital++)
{
  int j = 0;
  if (digital % 2 == 0)
  {
    if (j > 256) { j = 0; }
    analogWrite(9, j);
    j++;
    digitalWrite(9, HIGH);
    delay(1000);
  }
  else
  {
    if (j > 256) { j = 0; }
    analogWrite(9, j);
    j++;
    digitalWrite(9, LOW);
    delay(500);
  }
}
}
