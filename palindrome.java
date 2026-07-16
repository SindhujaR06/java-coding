import java.util.*;
public class palindrome{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word:");
String n = sc.nextLine();
String r ="";
for(int i = n.length()-1;i>=0;i--){
r = r+n.charAt(i);}
if(n.equals(r)){
System.out.println("palindrome");}
else{
System.out.println("not palindrome");}
}}