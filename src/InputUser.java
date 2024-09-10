import java.util.Scanner;

public class InputUser {
    private static Scanner scanner = new Scanner(System.in);



    public static int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }


    public static double getDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }


    public static String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int[] getIntArray(String message, int size) {
        int[] numbers = new int[size];
        System.out.println(message);
        for (int i = 0; i < size; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter number " + (i + 1) + ": ");
                String input = scanner.nextLine();

                if (isValidInteger(input)) {
                    numbers[i] = convertToInt(input);
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }
        return numbers;
    }
    private static boolean isValidInteger(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }
    // Helper method to convert a valid string to an integer
    private static int convertToInt(String str) {
        int result = 0;
        int sign = 1;
        int i = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }

        for (; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }

        return sign * result;
    }
//    public static String[] getStringArray(String message, int size) {
//        int[] numbers = new int[size];
//        System.out.println(message);
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        return numbers;
//    }

}

