import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    background(100);  
    stroke(255);
 //10*10 grid 
  for (int lineX = 0; lineX <= (width/2); lineX += (width/2/10)) {
    line(lineX, width/2, lineX, 0);
    }
  for (int lineY = 0; lineY <= (height/2); lineY +=(width/2/10)) {
    line(width/2, lineY, 0, lineY);
    }
//Circles
  for (int circleY = 20; circleY <= (height/2)-20; circleY += width/2/5 ) {
    for (int circleX = (0+ (width/2)); circleX <= width; circleX += width/2/5) {
      ellipse(circleX+25, circleY, 40, 40);
        }
  }


   //gradiant
    for (int gradiant = 0; gradiant <= (width/2); gradiant+=10) 
      for (int i = 0; i<width/2; i++){
      stroke(i, i, i);
      line(i,0+height/2,i,height);
        }
  
 //flower
    fill(255,0,0);
    int petalX = (width/4)*3;
    int petalY = (height/4)*3;
  
    translate(petalX,petalY);
    for (int petal = 0; petal < 8; petal++){
      ellipse(0, width/12, width/12, height/8);
      rotate(radians(45));
    }
    
    fill(0,255,0);
      ellipse(0, 0, (width/7), (width/7));


  
    
  }
  
  // define other methods down here.
}