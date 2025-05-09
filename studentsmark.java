public class studentsmark {
    public static void main(String[] args) {
        int[] marks = {80, 20, 60, 35, 100};
        int big=marks[0]; 
        for (int i = 1; i < marks.length; i++) {
            if (big<marks[i]) {  
                big=marks[i];    
                System.out.println("the greatest number is:");
            System.out.println(big);
            }
        }
        int small=marks[3];
        for(int i=0;i<marks.length;i++)
        {
            if(small>marks[i])
            {
              small = marks[i];
              System.out.println("the smallest number is:");
              System.out.println(small);
            }
        }
    }
}
