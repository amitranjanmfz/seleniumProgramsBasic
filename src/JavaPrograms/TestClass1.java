package JavaPrograms;

public class TestClass1 {



    public  void display(){
        int a=10;
        int b=20;


        System.out.println("This is display method for addition :"+(a+b));
    }

    public static void main(String[] args) {

        TestClass1 obj =new TestClass1();
        System.out.println("This is backup class");
        obj.display();



    }

}
