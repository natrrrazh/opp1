import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Random Integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // 2. Random Integer within a bound (0 to 100)
        int randomIntBounded = random.nextInt(100);
        System.out.println("Random Integer (0 to 99): " + randomIntBounded);

        // 3. Random Double
        double randomDouble = random.nextDouble();
        System.out.println("Random Double (0.0 to 1.0): " + randomDouble);

        // 4. Random Float
        float randomFloat = random.nextFloat();
        System.out.println("Random Float (0.0 to 1.0): " + randomFloat);

        // 5. Random Long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        // 6. Random Boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // 7. Random Bytes
        byte[] randomBytes = new byte[5];
        random.nextBytes(randomBytes);
        System.out.print("Random Bytes: ");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 8. Random Gaussian
        double randomGaussian = random.nextGaussian();
        System.out.println("Random Gaussian: " + randomGaussian);

        // 9. Setting a seed
        random.setSeed(12345);
        System.out.println("Random Integer with seed (12345): " + random.nextInt());

        // 10. Generate a few more integers with the same seed
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Integer with seed (12345): " + random.nextInt());
        }
    }
}