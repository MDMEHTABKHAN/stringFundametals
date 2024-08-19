public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        String s3 = "java";

        String s4 = "JAVA";

        // check based on value so s1 and s2  value are equal
        if (s1.equals(s2) == true){
            System.out.println("string value are equals");
        }else{
            System.out.println("String value are not equals");
        }

        // check basen on value s1 or s3 are different value
        if (s1.equals(s3) == true){
            System.out.println("String value are equal");
        }else{
            System.out.println("String value are not equals");
        }


        // check based on value and s1 or s4 are equal value
        if (s1.equals(s4) == true){
            System.out.println("String value are equal");
        }else{
            System.out.println("String value are not equals");
        }
    }
    
}
