//Name:Sourav Kumar Rungta
//Program of typecasting with operators.

class prog5{
    public static void main(String[] args) {
        int a=5;
        int b=10;
        double d=a;
        System.out.println(d);
    
    //Assignment Operator
    int c;
    c = a;
    System.out.println("Assigning c as a: "+c);
    c += a;
    System.out.println("Assignment operator as addition: "+c);
    
    //Comparison Operator
    if(a>b){
    System.out.println("True, a is greater than b");
    }
    else;{
    System.out.println("False, b is greater than a");
    }
    
    //Logical Operator
    if((a>b)&&(b>a)){
    System.out.println("If both condition follows then True");
    }
    else;
    System.out.println("If both condition does not follows then False");
    }
}