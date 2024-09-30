public class StringBufferTest {
    public static void main(String[] args) {
        // 1. Constructor
        StringBuffer sb = new StringBuffer();

        // 2. append(String str)
        sb.append("Hello");
        System.out.println("After append: " + sb); // Hello

        // 3. insert(int offset, String str)
        sb.insert(5, " World");
        System.out.println("After insert: " + sb); // Hello World

        // 4. delete(int start, int end)
        sb.delete(5, 11);
        System.out.println("After delete: " + sb); // Hello

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb); // olleH

        // 6. replace(int start, int end, String str)
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb); // Hi

        // 7. capacity()
        System.out.println("Capacity: " + sb.capacity()); // Should be >= 16

        // 8. length()
        System.out.println("Length: " + sb.length()); // 2 (length of "Hi")

        // 9. charAt(int index)
        System.out.println("Character at index 1: " + sb.charAt(1)); // i

        // 10. substring(int start, int end)
        String sub = sb.substring(0, 1);
        System.out.println("Substring (0, 1): " + sub); // H
    }
}

