public class CharacterTest {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.println("isLetter: " + Character.isLetter(ch));
        System.out.println("isDigit: " + Character.isDigit(ch));
        System.out.println("isWhitespace: " + Character.isWhitespace(' '));
        System.out.println("isUpperCase: " + Character.isUpperCase(ch));
        System.out.println("isLowerCase: " + Character.isLowerCase('a'));
        System.out.println("toUpperCase: " + Character.toUpperCase('b'));
        System.out.println("toLowerCase: " + Character.toLowerCase('D'));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(ch));
        System.out.println("getNumericValue: " + Character.getNumericValue('5'));
        System.out.println("compare: " + Character.compare('a', 'b'));
    }
}
