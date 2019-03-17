package cisc181.lab_4;

/**
 * @author ZhaoPeng
 * @date 2019/3/16
 */
public class Horse extends Pet {

    /**
     * constructor
     *
     * @param name     pet name
     * @param age      pet age
     * @param furColor pet furcolor
     */
    public Horse(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    /**
     * override some abstract method
     */
    @Override
    public void eat() {
        System.out.println("hay");
    }

    @Override
    public void speak() {
        System.out.println("neigh");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void play() {
        gallop();
        jump();
        gallop();
    }


    public void gallop() {
        System.out.println("Clippity Clop");
    }

    public void jump() {
        System.out.println("jump");
    }

    @Override
    public String toString() {
        return "Horse named " + super.toString();
    }
}
