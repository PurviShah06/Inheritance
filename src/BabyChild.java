public class BabyChild extends Child
{
    static BabyChild babyChild =new BabyChild();
    void multi()
    {
        int m1=a*b;
        System.out.println("Multiplication is =  ");
    }
    public static void main(String[] args) {
        BabyChild babyChild =new BabyChild();
        babyChild.multi();
        babyChild.add();
        babyChild.sub();

    }
}
