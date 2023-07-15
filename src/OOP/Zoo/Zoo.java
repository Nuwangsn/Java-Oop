package OOP.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(12,"Male",22);
        animal.sleep();
        animal.eat();

        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}
