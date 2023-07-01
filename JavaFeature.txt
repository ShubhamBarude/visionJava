package jAVA8Feature;

public class Test02 implements Test003 {
    @Override
    public void display(int a, int b) {
        System.out.println("it is div:" + (b / a));
    }

    public static void main(String[] args) {
        Test03 obj1 = new Test03();
        obj1.display(50, 10);

        Test003 ref = new Test003() {

            @Override
            public void display(int a, int b) {
                System.out.println("add:" + (a + b));
            }
        };
        ref.display(10,20);
        Test003 ref1=(int a, int b) ->{
            System.out.println("mul:"+(b*a));
        };
        ref1.display(50,30);
    }

}
interface Test002
{
   void display(int a,int b);

}