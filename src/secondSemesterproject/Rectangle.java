
package secondSemesterproject;

public class Rectangle {
    //The class has a private instance variable 'points', which is an array of 'Point' objects.
    private Point[] points;
     public static int countOfRectangle = 0;
    
    // Constructor to initialize the Rectangle points
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        points = new Point[4];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        countOfRectangle++;
    }

   // Set the four points of the rectangle
    public void setPoints(Point point1, Point point2, Point point3, Point point4) {
   //setPoints method allow to change the four points of the rectangle by passing new 'Point' objects.
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
    }

    // Get the array that includes the points
    public Point[] getPoints() {
    // getPoints() method returns the array of 'Point' objects representing the points of the rectangle.
        return points;
    }
    // Print the four points of the rectangle
    public void printPoints() {
    /*printPoints() method iterates over the 'points' array and
    calls the printPoint() method of each 'Point' object to print their coordinates.*/
        for (int i = 0; i < points.length; i++) {
            points[i].printPoint();
        }
}
   // Compute and return the area of the rectangle
    public double getArea() {
      double length = points[0].distanceToPoint(points[1]); //compute the distance between first & second point which is length
      double width = points[1].distanceToPoint(points[2]); //compute the distance between third & fourth point which is width
      double area = length * width;
       return area;
    }
    // Compute and return the perimeter of the rectangle
    public double getPerimeter() {
      double length = points[0].distanceToPoint(points[1]); //compute the distance between first & second point which is length
      double width = points[1].distanceToPoint(points[2]); //compute the distance between third & fourth point which is width
      double perimeter = 2 * (length + width);
       return perimeter;
    }
    
    public static int countOfRectangle(){
        return countOfRectangle;
    }
}