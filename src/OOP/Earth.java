package OOP;

public class Earth {
    public static void main(String[] args) {
        Human tom;
        tom = new Human();

        tom.name = "Tom Holand";
        tom.age = 22;
        tom.eyeColor = "Blue";
        tom.height = 5;
        tom.job ="software engineer";

        tom.speak();

        tom.work();

    }
}
