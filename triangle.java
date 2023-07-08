
class Main
{
    public static void main(String[] args)
    {
        triangle t1=new triangle();
        t1.base=4;
        t1.height=8;
        System.out.println(t1.area());

    }
}
class triangle
{
    double base,height;
    public double area()
    {
        return 0.5*base*height;
    }
    
}



