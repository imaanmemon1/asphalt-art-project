import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  /*
  * Painter takes paint 
  */
  
   public void takeAllPaint() {
     while(isOnBucket()) {
       takePaint();
     }
   }
  

  /*
  *  Painter moves forward until painter has reached a roadblock
  */
  
  public void moveFast() {
    while(canMove()) {
      move();
    }
  }

  
  /*
  * Painter paints and moves forward one spaces
  */
  
  public void paintToEmpty(String color) {
    while(hasPaint()) {
      paint(color);
      move();
    }
  }

  

  /*
  *  Painter paints donuts
  */
  
  public void paintDonut(String color) {
    while (hasPaint()){
      turnRight();
      paint(color);
      move();
      paint(color);
      move();
    }
  }



  
}