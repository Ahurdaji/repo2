
package secondSemesterproject;

public class Test_class {
    public static void main(String[] args) {
        //Point_Test
        Point point1; //p1 is an object
        point1 = new Point(1, 3); // Create a point object with coordinates (1, 3)
        point1.printPoint(); 
   
        Point point2; //p2 is an object
        point2 = new Point(4, 7); // Creat a point object with coordinates (4,7)
        point2.printPoint();
        
        //Calculate the distance between p1 & p2 using the distanceToPoint() method
        double distance = point1.distanceToPoint(point2); 
        System.out.println("Distance: " + distance); 
        
        // Print the count of Point objects created
        System.out.println("count of point object " +Point.countOfPoint());
        System.out.println("=======================");
         
        //Triangle_Test
        // Create the three points of the triangle
        Point p1T;
        p1T = new Point(0, 0);
        Point p2T;
        p2T = new Point(1, 4);
        Point p3T;
        p3T = new Point(3, 2);
        
        // Create a triangle object using the three points
        Triangle triangle;
        triangle = new Triangle(p1T,p2T,p3T);
        
        // Print the points of the triangle
        System.out.println("Triangle points:");
        triangle.printPoints();
     
      // Compute and display the area of the triangle
        double area = triangle.getArea();
        System.out.println("Triangle area: " + area);
        
      // Compute and display the perimeter of the triangle
        double perimeter = triangle.getPerimeter();
        System.out.println("Triangle perimeter: " + perimeter);
        
      // Print the count of Point objects created
      System.out.println("count of Triangle object " + Triangle.countOfTriangle());
      System.out.println("count of point object " +Point.countOfPoint());
       System.out.println("=======================");
      
      //Rectangle_Test
       // Create the four points of the rectangle
        Point p1;
        p1 = new Point(0, 0);
        Point p2;
        p2 = new Point(1, 0);
        Point p3;
        p3 = new Point(1, 1);
        Point p4;
        p4 = new Point(0, 1);
        
        // Create a rectangle object using the four points
        Rectangle rectangle;
        rectangle = new Rectangle(p1, p2, p3, p4);
        
        // Print the points of the rectangle
        System.out.println("Rectangle points:");
        rectangle.printPoints(); //printPoints() method is called on the 'rectangle' object to print the initial points.
        
         //Change the points of the rectangle
        Point newPoint1; //newPoints are created with different coordinates to represent the new points of the rectangle.
        newPoint1= new Point(2, 2);
        Point newPoint2;
        newPoint2 = new Point(3, 2);
        Point newPoint3;
        newPoint3 = new Point(3, 3);
        Point newPoint4;
        newPoint4 = new Point(2, 3); 
       //setPoints() method is called on the 'rectangle' object, to update the points of the rectangle.
        rectangle.setPoints(newPoint1, newPoint2, newPoint3, newPoint4);
        
        // Print the new points of the rectangle
        System.out.println("New rectangle points:");
        //printPoints() method is called again on the 'rectangle' object to print the new points.
        rectangle.printPoints();
        
        // Compute and display the area of the rectangle
        double area_Rectangle = rectangle.getArea();
        System.out.println("Rectangle area: " + area);
 
        // Compute and display the perimeter of the rectangle
        double perimeter_Rectangle = rectangle.getPerimeter();
        System.out.println("Rectangle perimeter: " + perimeter);
        
        // Print the count of Point objects created
        System.out.println("count of Rectangle object " +Rectangle.countOfRectangle());
         System.out.println("count of point object " +Point.countOfPoint());
         System.out.println("=======================");
        
        //PentagonalShape_Test
        double sideLength = 8.3; // For example side length is 8.3
    
       // Create an object 'pentagın' of PentagonalShape
       PentagonalShape pentagon;
       pentagon = new PentagonalShape(sideLength);
    
       // Get and print the side length
      double side_l = pentagon.getSideLength();
      System.out.println("Side length of pentagon : " + side_l);
    
      // Set a new side length
      double newSideLength = 4.0;
      pentagon.setSideLength(newSideLength);
    
      // Compute and print the perimeter of the pentagonal shape
     double perimeter_pentagonal = pentagon.computePerimeter();
     System.out.println("Perimeter: " + perimeter);
    
     // Compute and print the area of the pentagonal shape
     double area_pentagonal = pentagon.computeArea();
     System.out.println("Area: " + area);
    
     // Check if the pentagonal shape is regular
     boolean isRegular = pentagon.isRegular();
     System.out.println("Is regular: " + isRegular);
    
     // Compute and print the diagonal of the pentagon
     double diagonal = pentagon.computeDiagonal();
     System.out.println("Diagonal: " + diagonal);
    
     // Compute and print the height of the pentagon
     double height = pentagon.computeHeight();
     System.out.println("Height: " + height);
    
     // Print the count of Point objects created
      System.out.println("count of pentagonal object " +PentagonalShape.countOfPentagonal());
       System.out.println("count of point object " +Point.countOfPoint());
      
    }
}
