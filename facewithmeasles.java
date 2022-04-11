import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class facewithmeasles extends PApplet {
  public void setup() {


fill(0, 255, 0);

ellipse(100, 100, 150, 150);

fill(255);
size(200, 200);


fill(0, 255, 0);


ellipse(width*.5f, height*.5f, width*.75f, height*.75f);


fill(255);


size(200, 200);

fill(255);

ellipse(width*.5f, height*.5f, width*.75f, height*.75f);

fill(255);

ellipse(width*.375f, height*.425f, width*.15f, height*.1f);
ellipse(width*.625f, height*.425f, width*.15f, height*.1f);

fill(0);

ellipse(width*.375f, height*.425f, width*.05f, height*.05f);
ellipse(width*.625f, height*.425f, width*.05f, height*.05f);
fill(255);

arc(width*.5f, height*.625f, width*.4f, height*.25f, 0, 3.14f);
line(width*.3f, height*.625f, width*.7f, height*.625f);

fill (255, 0, 0);
ellipse(100, 75, 8, 8);
fill (255, 0, 0);
ellipse(78, 60, 8, 8);
fill (255, 0, 0);
ellipse(120, 40, 8, 8);
fill (255, 0, 0);
ellipse(50, 89, 8, 8);
fill (255, 0, 0);
ellipse(139, 139, 8, 8); 
fill (255, 0, 0);
ellipse(105, 67, 8, 8);
fill (255, 0, 0);
ellipse(54, 66, 8, 8);
fill (255, 0, 0);
ellipse(125, 45, 8, 8);
fill (255, 0, 0);
ellipse(43, 93, 8, 8);
fill (255, 0, 0);
ellipse(120, 123, 8, 8);
fill (255, 0, 0);
ellipse(166, 115, 8, 8);
fill (255, 0, 0);
ellipse(31, 115, 8, 8);
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "facewithmeasles" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
