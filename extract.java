class extract
{
    public static void main(String args[])
    {
        int n=123,sum=0;
        while(n>0)
        {
            sum=n%10;
        System.out.println("extract:"+sum);
        n=n/10;
        }
    }
}