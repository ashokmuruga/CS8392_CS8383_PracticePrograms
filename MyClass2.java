//Area of Square - Category4 - With Return type,With Arguements

public class MyClass2 {
    
    public int area(int s1)
    {
       
        int a=s1*s1;
        return a;
    }
    public static void main(String args[]) {
            int s=5;
            MyClass2 o=new MyClass2();
            int r = o.area(s);
            System.out.print("Area= "+r+" sq.units");
    }
}
