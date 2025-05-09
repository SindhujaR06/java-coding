public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        System.out.println(a+""+b+"");
        for(int i=2;i<10;i++)// already 2 index instialized so we used i=2
        {
            c=a+b;
            System.out.println(c+"");
            a=b;//to give a new number we have to swap as temperory variable
            b=c;
        }
    }
}
