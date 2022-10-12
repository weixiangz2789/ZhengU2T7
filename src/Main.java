import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        System.out.println("String length: " + str1.length());
        System.out.println("First half: " + str1.substring(0,(str1.length()/2)));
        System.out.println("Second half: " + str1.substring(str1.length()/2));

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length()){
            System.out.println(str1 + " is longer");
        }
        if (str1.length() < str2.length()){
            System.out.println(str2 + " is longer");
        }
        if (str1.length() == str2.length()){
            System.out.println("Both strings have the same length");
        }
        if (str1.equals(str2)){
            System.out.println("Both strings have the same exact characters");
        }
        int temp = str1.compareTo(str2);
        if (temp > 0){
            System.out.println(str2 + " is first alphabetically");
        }
        if (temp < 0){
            System.out.println(str1 + " is first alphabetically");
        }
        int index = str1.indexOf(str2);
        if (index == -1){
            System.out.println(str2 + " is not found in " + str1);
        }
        else {
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        }
    }
}
