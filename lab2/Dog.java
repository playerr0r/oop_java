
public class Dog extends Animal implements Swimable, Runable{
    Dog() {}

    @Override
    public void swim(){
        System.out.println("Собака попыт");
    }

    public void run(){
        System.out.println("Собака бежит");
    }
}
