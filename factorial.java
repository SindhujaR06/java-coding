public class factorial {
    static int fact(int n)
    {
        if(n<=1)//if(n==0||n==1) use instead
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        int result = fact(n);
        System.out.println(result);
    }
}
