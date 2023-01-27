import java.util.Scanner;

public class Demo{
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        System.out.print("What operation do you want?\n(0) Subtraction (1) Addition:\t");
        
        int input = kb.nextInt();

        System.out.print("First Number: ");
        int a = kb.nextInt();

        System.out.print("Second Number: ");
        int b = kb.nextInt();

        Operations o; 

        if(input == 0) {
            o = new Subtraction(a, b);
        }   else {
            o= new Addition(a, b);
        }

        o.operate();

        o.print();
    }
}