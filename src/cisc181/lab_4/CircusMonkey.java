package cisc181.lab_4;

/**
 *
 */
public class CircusMonkey extends Monkey{
    private Fruit snack;

    /**
     * constructor
     *
     * @param name     pet name
     * @param age      pet age
     * @param furColor pet furcolor
     */
    public CircusMonkey(String name, int age, String furColor) {
        super(name, age, furColor);
        snack.setType("banana"); 
        snack.setColor("yellow");
    }

    /**
     * constructor
     * @param name monkeyname
     * @param age monkey's age
     * @param furColor furcolor
     * @param type fruit type
     * @param color fruit color
     */
    public CircusMonkey(String name, int age, String furColor, String type, String color) {

        super(name, age, furColor);
        snack.setColor(color);
        snack.setType(type);
    }
}
