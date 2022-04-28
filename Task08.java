public class Task08 {
    public static void convertNumberToTime(int number){
        int numberOfHours = number / 60;
        int numberOfMinutes = number % 60;
        String hours = " hour";
        String minutes = " minute";
        String result = "";
        
        if(numberOfHours == 0 || numberOfHours > 1){
            hours += "s";
        }
        if(numberOfMinutes == 0 || numberOfMinutes > 1){
            minutes += "s";
        }
        result += numberOfHours + hours + ", " + numberOfMinutes + minutes;
        System.out.println(result);
    }

    public static void main(String[] args) {
        convertNumberToTime(2041);
        convertNumberToTime(1);
        convertNumberToTime(16);
        convertNumberToTime(68);
    }
}
