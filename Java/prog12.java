//Name:Sourav Kumar Rungta
//Program of funtion overload.

public class prog12
{
		static int f1(int a, int b){
		    return a+b;
		}
		static double f2(double a, double b){
		    return a-b;
		}
		public static void main(String[] args){
		    int a = f1(10,20);
		    double d = f2(10.0,20.0);
		    System.out.println(a);
		    System.out.println(d);
		}
}