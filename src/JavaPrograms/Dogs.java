package JavaPrograms;

public class Dogs extends Animals {

    public void bark(){

        System.out.println("Dog barks");
    }
    public void run(){
        System.out.println("Dog's run");
    }

    public static void main(String[] args) {

        Dogs obj=new Dogs();
        obj.bark();
        obj.run();


    }

}
