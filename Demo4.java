public class Demo4 {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "Python";
        String s3 = s1 + s2;
        String s4 = s1 + s2;

        String s5 = new String("JAVA + Python");

        if ( s3 == s4){
            System.out.println("References are equal");
        }else{
            System.out.println("References are not equal");
        }

        if (s3.equals(s4) == true){
            System.out.println("value are equal");
        }else{
            System.out.println("value are not equals");
        }

        if(s3 == s5){
            System.out.println("References are eqauls");
        }else{
            System.out.println("References are not equal");
        }

        if(s4.equals(s5) == true){
            System.out.println("value are equal");
        }else{
            System.out.println("value are not equals");
        }
    }
}
