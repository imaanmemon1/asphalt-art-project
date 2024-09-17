import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // Create an instance of FlagPainter 
    FlagPainter myFlagPainter = new FlagPainter();
    
    // Create an instance of BackgroundPainter 
    BackgroundPainter myBackgroundPainter = new BackgroundPainter();

    // Set the paint number (likely a color or identifier) for both painters
    myFlagPainter.setPaint(900);
    myBackgroundPainter.setPaint(900);

    // Paint a striped background with red color and 32 stripes
    myBackgroundPainter.paintWhiteStripedBackground("red", 32);
    
    // Paint a blue square using the flag painter
    myFlagPainter.paintSquare("blue");
  }
}
