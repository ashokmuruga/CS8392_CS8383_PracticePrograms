//Area of Square - Category3 - With Return type,No Arguements

public class MyClass1 {
    
    public int area()
    {
        int s1=5;
        int a=s1*s1;
        return a;
    }
    public static void main(String args[]) {
            MyClass1 o=new MyClass1();
            int r = o.area();
            System.out.print("Area= "+r+"sq.units");
    }
}
