
package secondSemesterproject;

public class PentagonalShape {
     //The class has a private instance variable 'sideLength'
     private int numberOfSides = 5;
     private double sideLength;
     public static int countOfPentagonal = 0;
    
    // Constructor to initialize the side length of the pentagonal shape
    public PentagonalShape(double s) {
      sideLength = s;
      countOfPentagonal++;
    }
    
    // Get the side length of the pentagonal shape
    public double getSideLength() {
        return sideLength;
    }
    
    // Set the side length of the pentagonal shape
    public void setSideLength(double s) {
        sideLength = s;
    }
     // Calculate and return the perimeter of the pentagonal shape
    public double computePerimeter() { //perimeter = 5 × sideLength
        return numberOfSides * sideLength;
    }
    
    // Calculate and return the area of the pentagonal shape
    public double computeArea() { //area formula = sideLength^2 × √(25 + 10√5)/4
        return (Math.sqrt(25 + 10 * Math.sqrt(5)) * sideLength * sideLength) / 4;
    }
    
    // Check if the pentagonal shape is regular
     public boolean isRegular() {
        return true;
    }
    // Calculate and return the diagonal of the pentagon
     public double computeDiagonal() { //diagonal formula = a × (1 + √5) / 2
        double diagonal = sideLength * (1 + Math.sqrt(5)) / 2;
        return diagonal;
    }

    // Calculate and return the height of the pentagon
     public double computeHeight() { //height formula = a × √(5 + 2√5) / 2
        double height = sideLength * Math.sqrt(5 + 2 * Math.sqrt(5)) / 2;
        return height;
    }
     
     public static int countOfPentagonal(){
        return countOfPentagonal;
    }
}
