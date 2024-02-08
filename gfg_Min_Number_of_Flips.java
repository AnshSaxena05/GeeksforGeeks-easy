public class gfg_Min_Number_of_Flips {
    public int minFlips(String S)
    {
        int n=S.length(),i=0,flip=0;
        while(i<n)
        {
            char expected_char= i%2 ==0 ? '1' : '0';
            if(S.charAt(i++)==expected_char) flip++;
        }
    return Math.min(n-flip, flip);
    }
    public static void main(String[] args) {
        gfg_Min_Number_of_Flips solution = new gfg_Min_Number_of_Flips();

        // Test cases
        String test1 = "1010";
        System.out.println("Minimum flips for " + test1 + ": " + solution.minFlips(test1));

        String test2 = "000";
        System.out.println("Minimum flips for " + test2 + ": " + solution.minFlips(test2));

        String test3 = "1111";
        System.out.println("Minimum flips for " + test3 + ": " + solution.minFlips(test3));
    }
}
