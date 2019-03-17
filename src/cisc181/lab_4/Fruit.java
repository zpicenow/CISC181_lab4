package cisc181.lab_4;

/**
 * fruit
 */
public class Fruit {
    private String type;
    private String color;

    /**
     * constructor
     * @param type type
     * @param color color
     */
    public Fruit(String type, String color) {
        this.type = type;
        this.color = color;
    }

    /**
     * accessor methods
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * accessor methods
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * override the tostring
     * @return color and type
     */
    @Override
    public String toString() {
        return color + " " + type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
