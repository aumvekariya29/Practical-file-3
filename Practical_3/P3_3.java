interface P
{
    final int p=5;
    void dispP();
}
interface P1 extends P
{
    final int p1=10;
    void dispP1();
}
interface P2 extends P
{
    final int p2=20;
    void dispP2();
}
interface P12 extends P1,P2
{
    final int p12=12;
    void dispP12();
}
class P3_3 implements P12
{
    public void dispP()
    {
        System.out.println("display P : "+p1);
    }
    public void dispP1()
    {
        System.out.println("display P1 : "+p2);
    }
    public void dispP2()
    {
        System.out.println("display P2 : "+p12);
    }
    public void dispP12()
    {
        System.out.println("display P12 : "+p);
    }

}
