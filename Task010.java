public class Task010 {
    static void commonCharacters(String input1, String input2){
        ArrayList<Character> commonChars = new ArrayList<Character>();
        String formattedString = "";
        for(int index = 0; index < input1.length(); index++){
            for(int counter = 0; counter < input2.length(); counter++){
              if(input1.charAt(index) == input2.charAt(counter) && commonChars.contains(input1.charAt(index)) == false){
                  commonChars.add(input1.charAt(index));
                  break;
              }
            }
        }
        formattedString = commonChars.toString().replace("[", "").replace("]", "");
        System.out.println("Common letters: " + formattedString);
    }

    public static void main(String[] args) {
        commonCharacters("house", "computers");
        commonCharacters("input1", "none1");
        commonCharacters("Hey1235", "Password23");
        commonCharacters("Hi", "Okay");
    }
}
