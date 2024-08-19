public class Ignorecase_string {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "java";

        String s3 = "JAVAPython";
        String s4 = new String("JaVApYthon");

        if (s1.equalsIgnoreCase(s2) == true){
            System.out.println("string value are equal");
        }else{
            System.out.println("string value are not equals");
        }
        if (s3.equalsIgnoreCase(s4) == true){
            System.out.println("string value are equal");
        }else{
            System.out.println("string value are not equals");
        }

    }
}
