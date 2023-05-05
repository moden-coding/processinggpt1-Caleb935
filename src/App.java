import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings() {
        size(1200, 800);
    }
    public void setup() {
        background(0, 119, 190);
    }
    public void draw() {
        noStroke();
        fill(255, 0, 100);
        rect(100, 100, 400, 100);
        
        
        
        stroke(255, 0, 0);
        strokeWeight(30);
        fill(255, 200, 0);
        ellipse(400, 400, 100, 100);



        strokeWeight(1);
        stroke(0, 0, 100);
        
        line(800, 700, 700, 600);
       

        triangle(1000, 100, 1100, 100, 1050, 200);
    }


    


}
