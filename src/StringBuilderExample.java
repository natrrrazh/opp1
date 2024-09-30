public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(", World!");
        System.out.println("After append: " + sb); // Hello, World!

        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb); // Hello Beautiful, World!

        sb.delete(5, 15);
        System.out.println("After delete: " + sb); // Hello, World!

        sb.reverse();
        System.out.println("After reverse: " + sb); // !dlroW ,olleH

        System.out.println("Capacity: " + sb.capacity()); // Returns current capacity
    }
}