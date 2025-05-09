public class magic {
    public static void main(String[] args) {
        int n=505,temp=0;
        temp=n;
        while(n>9)//seperate into single unit
        {
            int sum=0;//reset
            while (n>0)//check whether n is 0
           {
            sum+=n%10;// extract digit from number and add the digit;
            n=n/10;
            System.out.println(sum);
           }
            n=sum;//assign the value
            System.out.println(n);
        }
        if(n==1)
        System.out.println(temp+"is a magic number");
        else
        System.out.println(temp+"not a magic number");
    }
}
