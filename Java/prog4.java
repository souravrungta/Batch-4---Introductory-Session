//Name: Sourav Kumar Rungta
//Problem: Program with the strings.

class prog4 {
    public static void main(String[] args) {
    String s1="Sourav";    
    String s2="Rungta";
    System.out.println(s1+" "+s2); 
    System.out.println(s2.indexOf("n"));      
    String s3=s1+" "+s2;  
    System.out.println(s3.toUpperCase());    
    System.out.println(s3.toLowerCase());
      if(s3.length()<5){
        System.out.println("Long name");  
      }
      else{
        System.out.println("Short name"); 
      }
    }
}  