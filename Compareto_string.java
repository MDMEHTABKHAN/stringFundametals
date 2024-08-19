public class Compareto_string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hell";
        System.out.println((s1.compareTo(s2))); // return 0 beacuse they are equal value
        System.out.println(s1.compareTo(s3));// value are not equals
    }
}
