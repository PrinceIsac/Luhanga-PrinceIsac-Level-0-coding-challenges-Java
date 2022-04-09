public class EighthTask {
    public static void convertNumberToTime(int number){
        int numberOfhours = number / 60;
        int numberOfminutes = number % 60;
        String hour = " hour, ";
        String hours = " hours, ";
        String minute = " minute";
        String minutes = " minutes";

         if(numberOfhours == 1 && numberOfminutes == 1){
            System.out.println(numberOfhours + hour + numberOfminutes + minute);
        }
         else if(numberOfhours == 1 && (numberOfminutes > 1 || numberOfminutes == 0)){
            System.out.println(numberOfhours + hour + numberOfminutes + minutes);
        } 
         else if(numberOfhours > 1 && numberOfminutes == 1){
            System.out.println(numberOfhours + hours + numberOfminutes + minute);
        }
        else if(numberOfhours > 1 && (numberOfminutes > 1 || numberOfminutes == 0)){
            System.out.println(numberOfhours + hours + numberOfminutes + minutes);
        }else if(numberOfhours == 0 &&  numberOfminutes == 1){
            System.out.println(numberOfhours + hours + numberOfminutes + minute);
        }
        else if(numberOfhours == 0 &&  numberOfminutes > 1){
            System.out.println(numberOfhours + hours + numberOfminutes + minutes);
        }else if(numberOfhours == 0 && numberOfminutes == 0){
            System.out.println(numberOfhours + hours + numberOfminutes + minutes);
        }
    }

    public static void main(String[] args) {
        convertNumberToTime(63);
    }
}

