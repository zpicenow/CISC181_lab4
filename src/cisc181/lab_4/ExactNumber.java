package cisc181.lab_4;

/**
 * to store a fixed number of decimal places
 */
public class ExactNumber {
    public static final long DENOMINATOR = 10000000000000000L;
    private long left;
    private long right;

    /**
     * constructor that accepts two properties
     * @param left represent left part of the number
     * @param right right part of the number
     */
    public ExactNumber(long left, long right) {
        this.left = left;
        this.right = right;
    }

    /**
     * returns a double that is a close approximation of the ExactNumber
     * @return a close approximation of the ExactNumber
     */
    public double doubleValue(){
        double  dec = right / (double)DENOMINATOR;
        double full = left;
        return full + dec;
    }

    /**
     * returning the String representation of the value from the method doubleValue
     * @return exactNumber in string
     */
    @Override
    public String toString() {
        return String.valueOf(doubleValue());
    }

    /**
     *  indicating whether the right and left properties are equal
     * @param object another ExactNumber
     * @return whether the right and left properties are equal
     */
    @Override
    public boolean equals(Object object) {
        ExactNumber exactNumber = (ExactNumber) object;
        return this.left == exactNumber.left && this.right == exactNumber.right;
    }

    /**
     * compare to another number
     * @param exactNumber another exactnumber
     * @return -1 if this ExactNumber is less than the parameter,
     *          0 if they are equal,
     *          1 if this ExactNumber is greater than the parameter.
     */
    public int compareTo(ExactNumber exactNumber) {
        if (this.left > exactNumber.left) {
            return 1;
        } else if (this.left == exactNumber.left) {
            return Long.compare(this.right, exactNumber.right);
        } else {
            return -1;
        }
    }

    /**
     * takes as a parameter another ExactNumber and returns a new ExactNumber
     * @param exactNumber  another ExactNumber
     * @return the sum of the values of this ExactNumber and the other ExactNumber.
     */
    public ExactNumber add(ExactNumber exactNumber) {
        ExactNumber number = new ExactNumber(this.left + exactNumber.left,
                this.right + exactNumber.right);
        long pl = number.right / DENOMINATOR;
        long righttemp = number.right % DENOMINATOR;
        number.left = number.left + pl;
        number.right = righttemp;
        return number;
    }

    public static void main(String[] args) {
        ExactNumber exactNumber1 = new ExactNumber(1, 1000000000000000L);
        ExactNumber exactNumber2 = new ExactNumber(2, 9800000000000000L);
        ExactNumber threesevenfive = new ExactNumber(3, 7500000000000000L);
        ExactNumber sevenfifty = new ExactNumber(7, 5000000000000000L);

        System.out.println(exactNumber1.add(exactNumber2));
        System.out.println(exactNumber1+"   "+exactNumber2);
        ExactNumber number = threesevenfive.add(threesevenfive);
        System.out.println(number.left + "   "+ number.right);
        System.out.println(threesevenfive.left + "  "+ threesevenfive.right);
    }

}
