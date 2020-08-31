/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
    public void fiveRow(){
  hop();
  plant();
   hop();
  hop();
  plant();
   hop();
  hop();
  plant();
  hop(); 
  hop();
  plant();
  hop();
  
}

public void threeRow(){
  hop();
  hop();
  plant();
   hop();
  hop();
  plant();
   hop();
  hop();
  plant();
  hop(); 
  hop();
  
}

public void twoRow(){
  hop();
  hop();
  hop();
  plant();
   hop();
  hop();
  plant();
   hop();
  hop();
  hop();

}

public void oneRow(){
    hop();
  hop();
  hop();
  hop();
  plant();
   hop();
  hop();
   hop();
  hop();
  
}

public void setUpPins(){
  turn(RIGHT);
  hop();
  turn(LEFT);
  
  fiveRow();
  
  turn(RIGHT);
  hop();
  turn(RIGHT);
  
  threeRow();
  
  turn(LEFT);
  hop();
  turn(LEFT);
  
  twoRow();
  
  turn(RIGHT);
  hop();
  turn(RIGHT);
  
  oneRow();
  
  turn(LEFT);
  hop();
  turn(LEFT);
}
    


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
