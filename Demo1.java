public class Demo1 {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = new String("JAVA");
        String s3 = new String("JAVA");

        if (s1 == s2){
            System.out.println("References are equal"); 
        }else{
             System.out.println("References are not equal");  //references are not equal because using new keyword
        }


        if (s2 == s3){
            System.out.println("References are equal");
        }else{
            System.out.println("References are not equal"); // not equal because using new keyword so references are different in new keyword
     }
    }
    
}
