//Name: Sourav Kumar Rungta
//Problem: Program for the operators.

class prog3{
	public static void main(String[] args) {
    int a = 10;  
    int b = 20;

    //Arithmetic Operator
    System.out.println("Addition of a & b: " + (a + b));
    System.out.println("Substraction of a & b: " + (a - b));
    System.out.println("Multiplication of a & b: " + (a * b));
    System.out.println("Division of a & b: " + (a / b));
    System.out.println("Modulo of a & b: " + (a % b));
    
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