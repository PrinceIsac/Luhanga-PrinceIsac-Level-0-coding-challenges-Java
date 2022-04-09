public class Task05 {
   static double areaOfTriangle(double side1, double side2, double side3){
      double area = 0.0;
      double halfPerimeter = (side1 + side2 + side3) / 2;
      area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
      
      return area;
   }
   
   public static void main(String[] args) {
      areaOfTriangle(10, 10, 10);
   }
}

