public class gfg_Maximum_Sum_Problem {
    public int maxSum(int n)
    {
        int n1=n/2;
        int n2=n/3;
        int n3=n/4;
        int currsum= n1+n2+n3;
        
        if(currsum<= n)
            return n;
        
        return maxSum(n1)+maxSum(n2)+maxSum(n3);
    }
    public static void main(String[] args) {
        gfg_Maximum_Sum_Problem gfg = new gfg_Maximum_Sum_Problem();
        int result = gfg.maxSum(10);  // You can replace 10 with your desired input
        System.out.println("Maximum Sum: " + result);
    }
}
