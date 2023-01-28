import java.util.Scanner;

public class Demo{
    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args){

       

        //System.out.print("What operation do you want?\n(0) Subtraction (1) Addition:\t");
        
        //int input = kb.nextInt();

    
        int input = getOption();

        /*System.out.print("First Number: ");
        int a = kb.nextInt();

        System.out.print("Second Number: ");

        int b = kb.nextInt();*/
        int a = getNumbers();
        int b = getNumbers();
        

        Operations o;

    
        if (input == 0) {
            o = new Subtraction(a, b);
        }  
        else {
            o= new Addition(a, b);
        }
        

        o.operate();

        o.print();
    }

   /* public static int getOption(){
        System.out.print("What operation do you want?\n(0) Subtraction (1) Addition:\t");
        
        int input = kb.nextInt();

        return input; 
    }*/

    public static int getOption(){
        System.out.print("What operation do you want?\n(0) Subtraction (1) Addition:\t");   
        int input; 
        try{
            input = kb.nextInt();
        }   catch(Exception e){
             System.out.println("Try Again. That is an invalid value.");
        
             String not = kb.nextLine();
            input = getOption();
         }

         if(input != 0 && input != 1){
            System.out.println("Try Again. That is an invalid value.");
            input = getOption();
         }

     return input;
   }


   public static int getNumbers(){
        System.out.print("Number: ");    
        int a; 
        try{
            a = kb.nextInt();
        }   catch(Exception e) {
             System.out.println("Try Again. That is an invalid value.");
        
            String not = kb.nextLine();
            a = getNumbers();
         }

     return a;
   }
}