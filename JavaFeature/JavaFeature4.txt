package jAVA8Feature;

public class Test05 implements Test005 {
    @Override
    public void display(int a, int b) {
        System.out.println("it is div:" + (b / a));
    }

    public static void main(String[] args) {
        Test05 obj1 = new Test05();
        obj1.display(50, 10);

        Test005 ref = new Test005() {

            @Override
            public void display(int a, int b) {
                System.out.println("add:" + (a + b));
            }
        };
        ref.display(10,20);
        Test005 ref1=(int a, int b) ->{
            System.out.println("mul:"+(b*a));
        };
        ref1.display(50,30);
    }

}
interface Test005
{
    void display(int a,int b);

}
