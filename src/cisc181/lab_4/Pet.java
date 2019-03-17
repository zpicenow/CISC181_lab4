package cisc181.lab_4;

/**
 * abstract superclass
 */
public abstract class Pet {
    private String name;
    private int age;
    private String furColor;
    private Pet friend;

    /**
     * constructor
     * @param name pet name
     * @param age pet age
     * @param furColor pet furcolor
     */
    public Pet(String name, int age, String furColor) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
    }

    /**
     * get the pet name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set hte pet name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the pet age
     * @return pet age
     *
     */
    public int getAge() {
        return age;
    }

    /**
     * set the pet age
     * @param age pet age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get the pet furcolor
     * @return the pet fur color
     */
    public String getFurColor() {
        return furColor;
    }

    /**
     * set the pet furcolor
     * @param furColor pet furcolor
     */
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    /**
     * get the pet friend
     * @return the pet friend
     */
    public Pet getFriend() {
        return friend;
    }

    /**
     * set the pet friend
     * @param friend the pet friend
     */
    public void setFriend(Pet friend) {
        this.friend = friend;
    }

    public void birthday() {
        age++;
        System.out.println("Happy Birthday!" + name);
    }

    /**
     * some abstract method to be override
     */
    public abstract void eat();

    public abstract void speak();

    public abstract void play();

    public void sleep(){
        System.out.println("zzz");
    }
    /**
     * Override the toString()
     * @return name with furcolor
     */
    @Override
    public String toString() {
        return name + " with " + furColor + " fur";
    }
}
