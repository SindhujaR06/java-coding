public class armstrong {
    public static void main(String args[]){
        int n=153,temp,sum=0,d=0;
        temp=n;
        while (n>0) {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if (temp==sum) {
            System.out.println("it is a Armstrong");
        }
        else{
            System.out.println("not a Armstrong");
        }
    }
}
