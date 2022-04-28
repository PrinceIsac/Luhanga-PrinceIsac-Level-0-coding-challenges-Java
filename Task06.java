public class Task06 {
    static int maximum(int... arguments){
         int max = arguments[0];
         for(int counter = 1; counter < arguments.length; counter++){
                if(arguments[counter] > max){
                    max = arguments[counter];
                }
            }
        
        return max;
    }

    public static void main(String[] args) {
        maximum(10,100,12);
        maximum(10,2);
        maximum(-10,-1,-100,25,50,30);
        maximum(1);
    }
}
