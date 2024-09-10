import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //initiating the flagprinter 
FlagPainter myFlagPainter = new FlagPainter();

    //setting the paint to blue
 myFlagPainter.setPaint(900);
myFlagPainter.paintSquare("blue");

   myFlagPainter.move();
    myFlagPainter.turnRight();
    myFlagPainter.move();
    myFlagPainter.turnLeft();
    myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
    myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
    myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");
    myFlagPainter.paintColorDottedLine("blue");
        myFlagPainter.paintWhiteDottedLine("blue");

    //setting the paint colors red and white for the stripes 
    
myFlagPainter.paintStripes("red");
    myFlagPainter.paintStrip("white");
}

}