import java.util.ArrayList;

public class Task09 {
   public static void printVowels(String stringOfChars){
        char[] vowels = {'a','e','i','o','u'};
        String newString = stringOfChars.toLowerCase();
        ArrayList<Character> presentVowels = new ArrayList<Character>();
        String formattedVowels ="";

        for(int index = 0; index < newString.length(); index++){
            for(int counter = 0; counter < vowels.length; counter++){
                if(newString.charAt(index) == vowels[counter] && presentVowels.contains(vowels[counter]) == false){
                    
                    presentVowels.add(vowels[counter]);
                }
            }
        }
        formattedVowels = presentVowels.toString().replace("[", "").replace("]", "");
        
        System.out.println("Vowels: " + formattedVowels);
    }

    public static void main(String[] args) {
        printVowels("stringOfChaaars");
        printVowels("My name is Prince");
        printVowels("Thank you Umuzi");
    }
    
}
