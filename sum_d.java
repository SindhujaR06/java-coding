class sum_d
{
    public static void main(String args[])
    {
        int n=123,sum=0,d=0;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
            System.out.println("sum of digits:"+sum);
    }
}