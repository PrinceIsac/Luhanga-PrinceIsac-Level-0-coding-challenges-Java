public class Task04 {
    static void evenOrOdd(int number){
        if(number % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
   
    public static void main(String[] args) {
        evenOrOdd(9);
        evenOrOdd(1);
        evenOrOdd(0);
        evenOrOdd(10);
    }
}
