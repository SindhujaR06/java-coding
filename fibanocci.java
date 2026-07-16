import java.util.*;
public class fibanocci{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
int a=0,b=1,c;
System.out.println(a+" ");
System.out.println(b+" ");
for(int i =2;i<n;i++){
c=a+b;
a=b;
b=c;
System.out.println(c+" ");}
} }

