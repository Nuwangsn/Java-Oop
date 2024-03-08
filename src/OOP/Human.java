package OOP;

public class Human {
    String name;
    int age;
    String eyeColor;
    int height;
    String job;

    public Human(){
        System.out.println("Human landed");
    }


    public void speak(){
        System.out.println("hey i am "+name);
        System.out.println("I am "+age+" years old");
        System.out.println("My have "+eyeColor+" eyes");
        System.out.println("I am "+height+" inches tall");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("I am working as a "+job);
    }

    public void eat(){
        System.out.println("eating ........");
    }


}
