//Name:Sourav Kumar Rungta
//Program of pattern using while loop.

class prog9{
public static void main(String args[]){
    int row=1,column=1;
    int x;
    do{
    x=4;
    do{
    System.out.print("");
        x--;
    }while(x>=row);
        column=1;
    do{
    System.out.print("*"+" ");
        column++;
    }while(column<=row);
    System.out.println(" ");
        row++;
    }while (row<=5);
    }
}