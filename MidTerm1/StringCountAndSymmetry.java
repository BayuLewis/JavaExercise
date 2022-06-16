public class StringCountAndSymmetry {
    static String InputString() {
        System.out.println("Enter a string");
        return System.console().readLine();
    }

    /* Count how many characters in the string. */
    static int CountString(String str) {
        return str.length();
    }

    /* Pretend you have a triangle */
    /* If the string is "ABBA", then it's Symmetric, else if the string is "ABCDEFG", then it's not. */
    static boolean isSymmetric(String str) {
        int i, j;
        for (i = 0, j = str.length() - 1; i < j; ++i, --j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = InputString();
        System.out.println("The string is " + str);
        System.out.println("The number of characters in the string is " + CountString(str));
        System.out.println("The string is " + (isSymmetric(str) ? "Symmetric" : "Not Symmetric"));
    }
}
