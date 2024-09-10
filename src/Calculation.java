public class Calculation {
    public static int getSumOfArray() {
        int result = 0;
        int userSize = 0;

        // Get valid size input
        while (true) {
            try {
                userSize = InputUser.getInt("How many numbers do you want to store as collection number of an array to sum? ");
                if (userSize <= 0) {
                    System.out.println("Error: Array size must be positive. Please try again.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        // Get valid number inputs
        System.out.println("Let's type each number!");
        for (int i = 0; i < userSize; i++) {
            while (true) {
                try {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    int num = InputUser.getInt("");
                    result += num;
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        return result;
    }
}