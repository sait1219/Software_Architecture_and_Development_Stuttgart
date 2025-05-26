package SOLID;

public class LSP_02 {

    
    public static class Bird {
        public void move() {
            System.out.println("The bird is moving...");
        }
    }

    
    public interface Flyable {
        void fly();
    }

   
    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }

   
    public static class Penguin extends Bird {
        public void swim() {
            System.out.println("The penguin is swimming...");
        }
    }

    
    public static void moveFlyingBird(Flyable bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        moveFlyingBird(sparrow); // Valid
    

        sparrow.move(); 
        penguin.move();
        penguin.swim(); 
    }
}
