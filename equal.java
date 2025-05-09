public class equal {
    public static void main(String[] args) {
        int a[]={1,2,1};
        int b[]={1,2,1};
        boolean isEqual= true;
        if(a.length==b.length){
            isEqual= false;
        }
        else
        {
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i])
                {
                    isEqual = false;
                break;
                }
            }

        }
        if(isEqual){
            System.out.println("they are equal");
        }
        else {
               System.out.println("they are not equal");
        }
                }
            }
