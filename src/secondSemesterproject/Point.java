         
package secondSemesterproject;

public class Point {
    //The class has two instance variables: x and y, which hold the values of the point's coordinates.
     private int x;
     private int y;
     public static int countOfPoint = 0;
    
    // Constructor to initialize x and y by 0    
    public Point() {
      x = 0;
      y = 0; 
      countOfPoint++;
}   
  // Constructor to initialize x and y by two input parameters
    public Point(int xx, int yy){
        x = xx;
        y = yy;  
        countOfPoint++;
    }
    //Get the value of x
    public int getX() {
        return x;
    }
    //Get the value of y
    public int getY() {
        return y;
    }
    //Set the value of x
    public void setX(int x) {
        this.x = x;
    }
    //Set the value of y
    public void setY(int y) {
        this.y = y;
    }
    
    // Print the coordinates of the point
    public void printPoint() { //printPoint() method prints the coordinates of the point in the format (x,y)
        System.out.println("(" + x + "," + y + ")");
    }
   // Calculate the distance between this point and another point
    public double distanceToPoint(Point otherPoint) {
        int x1 = x - otherPoint.x; // compute the difference in x-coordinates
        int y1 = y - otherPoint.y; // compute the difference in y-coordinates
        return Math.sqrt(x1 * x1 + y1 * y1); //The formula is : square root of [(x1 -x2)^2 + (y1-y2)^2]
    }
    
    public static int countOfPoint(){
        return countOfPoint;
    }
}
