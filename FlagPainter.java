import org.code.neighborhood.*;
public class FlagPainter extends PainterPlus {
// Constructor for FlagPainter
  public FlagPainter(){
    super();
  }
  
//painting the squares on the large square of the flag
  public void paintSquare(String color) {
     // Paint the square with the given color
    paintSquareSide(color);
    paintSquareSide(color);
    paintSquareSide(color);
    paintSquareSide(color);

    // Move to the next row and paint alternating dotted lines
    move();
    turnRight();
    move();
    turnLeft();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
  }

  // Paints one side of the square with the given color
  public void paintSquareSide(String color){
    // Paint each side of the square with the specified color
     paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight(); // After completing one side, turn to start the next side

  }
  
//the white dotted line representing stars on the flag
public void paintWhiteDottedLine(String color) {
  // Paint a line of white and colored dots
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  
}

  // Paints the blue dots on in the square box with the white dots 
  public void paintColorDottedLine(String color) {
    // Paints a line of alternating colored and white dots
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint(color);

  
 }
  // Moves to the next row by turning around and moving forward
    public void nextRow(){
  if(isFacingEast()){
    turnRight();
    move();
    turnRight();
  } else {
    turnLeft();
    move();
    turnLeft();
  }
    
  }

}

 