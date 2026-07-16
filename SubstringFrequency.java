import java.util.Scanner;

public class SubstringFrequency {

    public static int countFrequency(String str, String sub) {
        if (str == null || sub == null || sub.isEmpty()) return 0;

        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();           
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int freq = countFrequency(str, sub);
        System.out.println("Frequency of \"" + sub + "\" in \"" + str + "\" = " + freq);
        sc.close();
    }
}