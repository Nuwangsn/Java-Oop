package OOP;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name,int age,int heightInInches,String eyeColor){
        this.name = name;
        this.age = age;
        this.heightInInches=heightInInches;
        this.eyeColor=eyeColor;
        System.out.println("Human is landing on the Earth to create the World");
        speak(name,age,heightInInches,eyeColor);
    }

    public void speak (String name,int age,int heightInInches,String eyeColor){
        System.out.println("Hi My name is "+name+" good to meet you.");
        System.out.println("My age is "+age);
        System.out.println("I am "+heightInInches+" inches tall");
        System.out.println("My eye are "+eyeColor+" color");
    }


}
