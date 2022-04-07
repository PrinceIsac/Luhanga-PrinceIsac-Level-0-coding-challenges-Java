public class SixthTask {
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
    }
}

