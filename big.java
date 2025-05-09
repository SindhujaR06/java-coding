class big
{
    public static void main(String args[])
    {
        int n=123,b=Integer.MIN_VALUE;
        while(n>0)
        {
          int d=n%10;
          if(b>d)
          b=d;
          n=n/10;
        }
             System.out.println(b);
    }
}