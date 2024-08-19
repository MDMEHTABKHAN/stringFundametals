class Demo{
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "JAVA";
        String s3 = new String("JAVA");


        // references are equal because both s1 and s2 are create on constant pool
        if (s1 == s2){
            System.out.println("References  are equals");
        }else{
            System.out.println("eferences are not equals");
        }

        // value are equal 
        if (s1.equals(s2) == true){
            System.out.println("String value are equal");
        }else{
            System.out.println("String value are not equal");
        }

        // value are equal 
        if (s1.equals(s3) == true){
            System.out.println("String value are equal");
        }else{
            System.out.println("String value are not equal");
        }




    }
}