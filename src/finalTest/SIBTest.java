package finalTest;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        // owner ="sathish"; you can not reassign owner here bz you already did
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }

}
