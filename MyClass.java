//Area of Square - Category2 - No return type,with Arguements
public class MyClass {
    
    public void area(int s1)
    {
        int a=s1*s1;
        System.out.print("Area="+a);
    }
    public static void main(String args[]) {
            int s=5;
            MyClass o=new MyClass();
            o.area(s);
    }
}

