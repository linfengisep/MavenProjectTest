package ex01_E;

class A
{
    int x;

    void m()
    {
        System.out.println("Je suis dans la méthode m d'une instance de A");
    }
}

class B extends A
{
    int x;

    void m()
    {
        System.out.println("Je suis dans la méthode m d'une instance de B");
    }
}


class C extends B
{
    int x, a;

    void m()
    {
        System.out.println("Je suis dans la méthode m d'une instance de C");
    }

    void test()
    {
        a = super.x;
        System.out.println("a = super.x:="+a);
        a = ((B)this).x;
        System.out.println("a = ((B)this).x:="+a);
        a = ((A)this).x;
        System.out.println("a = ((A)this).x:="+a);
        super.m();
        ((B)this).m(); // (1)
    }

    public static void main(String[] args)
    {
		C c = new C();
		c.test();
    }
}
