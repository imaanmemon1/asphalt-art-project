import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

  // Paints the background with the specified color and size
  public void paintBackground(String color, int size) {
    // Paint rows until reaching the end of the grid
    while (canMove("south")) {
      paintRow(color, size);
      turnToWest();
      if (canMove("south")) {
        move();
        paintRow(color, size);
        turnToEast();
      }
    }

    // Paint the last row
    paintRow(color, size);
    turnAround();
    moveToCorner();
  }
  // Paints a row with the given color and number of spaces
  public void paintRow(String color, int spaces) {
    setPaint(spaces);
    paintLine(color, spaces);
  }

  public void paintLine(String color, int spaces) {
    while (spaces > 0) {
      paint(color);
      if (canMove()) {
        move();
      }
      spaces--;
    }
  }
   // Turns the painter to face west if currently facing east
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
    }
  }
 // Turns the painter to face east if currently facing west
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
    }
  }

  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  public void moveToCorner() {
    // Move to the bottom right corner
    while (canMove()) {
      move();
    }
    turnRight();

    while (canMove()) {
      move();
    }
  }
 // Paints a white striped background with the specified color and stripe width
  public void paintWhiteStripedBackground(String color, int stripeWidth) {
    while (canMove()) {
      paintRow(color, stripeWidth);
      nextRow();
      if (canMove()) {
        paintRow("white", stripeWidth);
        nextRow();
      }
    }
  }
// Moves the painter to the next row and adjusts direction if needed
  public void nextRow() {
    if (isFacingEast()) {
      turnRight();
      if (canMove()) {
        move();
        turnRight();
      } else {
        turnLeft();
      }
    } else {
      turnLeft();
      if (canMove()) {
        move();
        turnLeft();
      } else {
        turnRight();
      }
    }
  }
}
