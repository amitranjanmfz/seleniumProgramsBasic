package JavaPrograms;

public class Cats extends Animals {

    public void Meuw(){

        System.out.println("Cat's sound");
    }

    public static void main(String[] args) {

        Cats obj=new Cats();
        obj.Meuw();
        obj.run();

    }
}
