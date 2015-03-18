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
    
    void display()
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
            vertex(cos(theta+spin) * (s * 0.60) ,sin(theta+spin) * (s *.60));
        }
        endShape(CLOSE);
        
        popMatrix();       
        
        pushMatrix();
        translate(x,y);
       
        line(-ratio*10, 0, -ratio*10, -s/2.5); 
        line(ratio*10, 0, ratio*10, -s/2.5); 
        arc(0,0,s,s/4,0,PI);
        popMatrix();
    }
    
    void move()
    {
    }
}

