package class3;

class const1
{
    public void name()
    {
        System.out.println("hii from constructor1");
    }
    public void name(int a)
    {
        System.out.println(a);
    }
}

public class ConstCheck {
    public static void main (String[] args)
    {
        const1 statement = new const1();
        statement.name();
        statement.name(15);

    }
}

