public class Addition extends Operations{
    
   public Addition(int a, int b){
        super(a, b);
    }
    
    public int operate(){
        return a + b; 
    }

    public void print(){
        System.out.println("\nYou chose Addition");
        super.print();
    }
}