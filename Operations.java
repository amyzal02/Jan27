public abstract class Operations {

    public int a; 
    public int b; 

   public Operations(int a, int b){
        this.a = a; 
        this.b = b; 
    }

    public abstract int operate();

    public void print(){
        System.out.println("The end product of " +  a + " and " + b + " is.... " + operate());
    
    }

}