
package secondSemesterproject;

public class Triangle {
    //The class has a private instance variable 'points', which is an array of 'Point' objects.
    private Point[] points;
    public static int countOfTriangle = 0;
    
    // Constructor to initialize the triangle points
    public Triangle(Point p1, Point p2, Point p3) {
        points = new Point[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
     countOfTriangle++;
    }
    
    // Set the three points of the triangle  
    public void setPoints(Point p1, Point p2, Point p3) {
    // setPoints() method allow to change the three points of the triangle.
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
    }
    // Get the array that includes the points
    public Point[] getPoints() {
    //getPoints method returns the array of points.
        return points;
    }
    // Print the three points of the triangle
    public void printPoints() {//printPoints() method is responsible for printing the coordinates of each point in the triangle.
        for (int i = 0; i < points.length; i++) { 
            points[i].printPoint();
        }
    }
 /*To Compute the area of a trinagle and we dont have base and height we can use this formula:
    Area = Math.pow(s*(s-side1)*(s-side2)*(s-side3)) 
     "side1,side2,side3" are the lengths of the sides of the triangle 
    "s" is the semi-perimeter of the triangle, defined as: s = (a + b + c)/2 
     */
    public double getArea() {
    double side1 = points[0].distanceToPoint(points[1]); // the length of first side
    double side2 = points[1].distanceToPoint(points[2]); // the length of sec side
    double side3 = points[2].distanceToPoint(points[0]); //the length of third side
    
    // Calculate the semi-perimeter
    double s = (side1 + side2 + side3) / 2;
    
    // Calculate the area using this formula
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
          return area;
   }
   // Compute and return the perimeter of the triangle
    public double getPerimeter() {
    double side1 = points[0].distanceToPoint(points[1]); //distance between first & second point
    double side2 = points[1].distanceToPoint(points[2]); //distance between second & third point
    double side3 = points[2].distanceToPoint(points[0]); //distance between third & first point
    double perimeter = side1 + side2 + side3;
    return perimeter;
}
    
    public static int countOfTriangle(){
        return countOfTriangle;
    }
}
