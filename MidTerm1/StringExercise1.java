public class StringExercise1{
    static String BitchVanString(String str){
        String[] words = str.split(" ");
        String firstWord = words[0];
        String restOfString = str.substring(firstWord.length() + 1);
        String lowerCaseRestOfString = restOfString.toLowerCase();
        return firstWord.toUpperCase() + " " + lowerCaseRestOfString;
    }

    public static void main(String[] args){
        System.out.println(BitchVanString("nGuYen tHi bIch vAn"));
    }
}