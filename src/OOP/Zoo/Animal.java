package OOP.Zoo;

public class Animal {
    int age;
    String gender;
    int weightInLs;

    public Animal(int ageParam, String genderParam, int weightInLsParam){
        this.age = ageParam;
        this.gender = genderParam;
        this.weightInLs = weightInLsParam;
    }

    public void eat(){
        System.out.println("Eating .....");
    }

    public void  sleep(){
        System.out.println("sleeping.....");
    }
}
