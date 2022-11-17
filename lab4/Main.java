public class Main{
    public static void main(String[] agrs) {
        Dog bobs = new Dog();
        bobs.setHeight(20);
        bobs.setWeight(5);

        Fish nemo = new Fish();
        nemo.setHeight(1);

        Duck donald = new Duck();
        donald.setWeight(3);


      
        bobs.run();
        donald.fly();
        nemo.swim();
        letsSwim(nemo);
        
    }
    
    public static void letsSwim(Swimable obj){
        obj.swim();
    }
}
