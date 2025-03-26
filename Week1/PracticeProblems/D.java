public class D {
    int a=12;
    void some(){
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
    }
}
class A extends D{
    int a=10;
}
class B extends A{
    int a=20;
    void some(){
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
