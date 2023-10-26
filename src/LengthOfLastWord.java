public class LengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWord("  Hello   World     as    ");
    }

    public static void lengthOfLastWord(String s) {
        String[] arrayOfStrings = s.trim().split("\\s+");
        System.out.println(arrayOfStrings[arrayOfStrings.length - 1].length());
    }
}
