public class calling
{
    public static void main(String[] args)
    {
        publicSum s = new publicSum();
        System.out.println(s.Sum(10,20));
        protectedSub p = new protectedSub();
        System.out.println(p.Sub(60,23));
        // privateProduct r = new privateProduct();
        // System.out.println(r.Product(60,23));
    }
}


