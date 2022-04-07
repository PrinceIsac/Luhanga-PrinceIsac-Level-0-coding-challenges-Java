public class FifthTask {
   static double areaOfTriangle(double side1, double side2, double side3){
       double area = 0.0;
       double sideSum = (side1 + side2 + side3);
       area = sideSum / 2;
      
    return area;
   }
   
   public static void main(String[] args) {
      areaOfTriangle(10, 20, 2);
   }
}

