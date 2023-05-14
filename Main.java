public class Main {
    public static void main(String args[]) {
        System.out.println("Enter the string to check");
        String input = System.console().readLine();

        CheckPalindrome check = new CheckPalindrome();
        check.isPalindrome(input);

    }
}

class CheckPalindrome {

    static String userInput;
    static String reverse;

    void isPalindrome(String input) {
        userInput = input;
        reverse = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverse += userInput.charAt(i);
        }

        checkEquality(userInput, reverse);
    }

    void checkEquality(String originalText, String reverseText) {
        if (originalText.equals(reverseText)) {
            System.out.println(originalText + " is a palindrome");
        } else {
            System.out.println(originalText + " is not a palindrome ");
        }
    }

}