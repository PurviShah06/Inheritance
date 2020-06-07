public class Child extends Parent {
    void sub(){
        double ans1 =a-b;
        System.out.println("Subtraction is "+ans1);
    }
    public static void main(String[] args) {
        Child ch =new Child();
        ch.add();
        ch.sub();
    }
}
