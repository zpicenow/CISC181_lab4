package cisc181.lab_4;


public class Monkey extends Pet{
    /**
     * constructor
     *
     * @param name     pet name
     * @param age      pet age
     * @param furColor pet furcolor
     */
    public Monkey(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    @Override
    public void eat() {
        System.out.println("banana");
    }

    @Override
    public void speak() {
        System.out.println("eeh eeh");

    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void play() {
        climbUp();
        System.out.println("swing from trees");
        climbDown();
    }


    public void climbUp(){
        System.out.println("In Tree");
    }

    public void climbDown(){
        System.out.println("On Ground");
    }

    @Override
    public String toString() {
        return "Monkey named "+super.toString();
    }
}
