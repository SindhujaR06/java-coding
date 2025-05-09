public class squarearr {
    public static void main(String[] args) {
        int arr[]={1,2,1,4,6,8};
        int count=0;
        for(int i=0; i< arr.length; i++){
            int sqrt=(int)Math.pow(arr[i],2);
            if(sqrt*sqrt==arr[i])
             {
                count++;
        
             }
            }
            System.out.println(count);
        }
}
