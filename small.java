class small
{
    public static void main(String args[])
    {
        int n=123,s=Integer.MAX_VALUE;
        while(n>0)
        {
          int d=n%10;
          if(s>d)
          s=d;
          n=n/10;
        }
             System.out.println(s);
    }
}