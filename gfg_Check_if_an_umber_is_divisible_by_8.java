public class gfg_Check_if_an_umber_is_divisible_by_8 {
    int DivisibleByEight(String s) {
        // last 3 digits should be divisible by 8
        int n = s.length();
        if (n <= 2) {
            int num = Integer.parseInt(s);
            if (num % 8 == 0)
                return 1;
            else
                return -1;
        }
        String sub = s.substring(n - 3);
        int x = Integer.parseInt(sub);
        if (x % 8 == 0)
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        // Instantiate the class
        gfg_Check_if_an_umber_is_divisible_by_8 checker = new gfg_Check_if_an_umber_is_divisible_by_8();

        // Test cases
        String number1 = "123456";
        String number2 = "876";
        String number3 = "456";

        // Test the DivisibleByEight method
        int result1 = checker.DivisibleByEight(number1);
        int result2 = checker.DivisibleByEight(number2);
        int result3 = checker.DivisibleByEight(number3);

        // Print the results
        System.out.println(number1 + " is divisible by 8: " + (result1 == 1));
        System.out.println(number2 + " is divisible by 8: " + (result2 == 1));
        System.out.println(number3 + " is divisible by 8: " + (result3 == 1));
    }
}
