import java.util.Arrays;

public class gfg_Maximize_sum_after_K_negations {
    public static long maximizeSum(long a[], int n, int k)
    {
        int i=0;
        Arrays.sort(a);
        //convert negative number to positive
        while(i<n && a[i]<0 && k>0)
        {
            a[i]=-a[i];
            i++;
            k--;
        }
        // if k is still not 0 and k is odd
        if(k>0 && k%2 !=0)
        {
            Arrays.sort(a);
            a[0]=-a[0];
        }
        long sum=0;
        for(long num: a)
            sum += num;
            
        return sum;
    }
    public static void main(String[] args) {
        // Example usage
        long[] array = {-2, 9, -5, 0, 2};
        int size = array.length;
        int negations = 4;

        long result = maximizeSum(array, size, negations);

        System.out.println("Maximized sum: " + result);
    }
}
