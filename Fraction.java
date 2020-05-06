public class Fraction
{
    int num,deno;
    public Fraction()
    {
        num=0;
        deno=1;
    }
    public Fraction(int a,int b)
    {
        num=a;
        deno=b;
    }
    void show()
    {
        System.out.println(num+"/"+deno);
    }
    int hcf(int a,int b)
    {
        int r=a%b;
        while(r!=0)
        {
            
            a=b;
            b=r;
            r=a%b;
        }
        return (b);
    }
    int lcm(int a,int b)
    {
        int lcm=(a*b)/hcf(a,b);
        return (lcm);
    }
    public Fraction add(Fraction a)
    {
        int l=lcm(deno,a.deno);
        int h=(l/deno*num)+(l/a.deno*a.num);
        return new Fraction(h,l);
    }
    public static void main(String args[])
    {
        Fraction P=new Fraction(2,7);
        Fraction Q=new Fraction(3,14);
        Fraction S=new Fraction();
        S=P.add(Q).reduce();
        P.show();
        Q.show();
        S.show();
    }
    public Fraction reduce()
    {
        int h=hcf(num,deno);
        num/=h;
        deno/=h;
        return this;
    }
}