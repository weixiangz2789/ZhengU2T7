public class Main {
    public static void main(String[] args){
        String str1 = "This is my string!";
        String str2 = "This is my string!";
        String str3 = new String("This is my string!");
        String str4 = new String("This is my string!");

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

    }
}
