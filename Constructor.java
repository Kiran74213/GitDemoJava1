
public class Constructor {
    public static void main(String[] args) {

        B ref = new B();
        ref.show();
        
    }
}

class B{
    int a; String name;

    /*B() // Constractor ----------          // If we can not creat any CONSTRUCTOR then java compiler creat
    {                                        //  a CONSTRUCTOR by itself. **********************************
        a=1; 
        name="Rahul";
    }*/

    void show()   // Method --------------
    {
        System.out.println(a+" "+name);
    }
    
    void developBranch()   // Method --------------
    {
        System.out.println("Develop branch changes");
    }

    
}
