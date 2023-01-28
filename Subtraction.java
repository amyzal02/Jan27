public class Subtraction extends Operations {

    public Subtraction(int a, int b){
        super(a, b);
    }
    
    public int operate(){
        return a - b; 
    }

    public void print(){
        System.out.println("\nYou chose Subtraction");
        super.print();
    }

}