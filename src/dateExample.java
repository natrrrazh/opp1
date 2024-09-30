import java.util.Date;

public class dateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time: " + date); // Current date and time

        System.out.println("Time in milliseconds: " + date.getTime()); // Milliseconds since epoch

        System.out.println("Date (after 1000 ms): " + new Date(date.getTime() + 1000)); // 1 second later

        System.out.println("Year: " + (date.getYear() + 1900)); // Year (adjusted)
        System.out.println("Month: " + (date.getMonth() + 1)); // Month (0-based index)
    }
}
