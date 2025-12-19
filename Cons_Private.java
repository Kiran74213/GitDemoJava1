

public class Cons_Private {
    public static void main(String[] args) {
       // E re = new E();
    }
}

class E{
    int a; double b; String c;
    private E()     // Private Constructor ----------------------------------------
    {
       a=10; b=10.50; c="Aman";
       System.out.println(a+" "+b+" "+c); 
    }

    public void status(){
         System.out.println("I am fine");
    }

    
}