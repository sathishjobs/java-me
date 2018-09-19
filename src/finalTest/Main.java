package finalTest;

public class Main {
    public static void main(String[] args) {
        Some one = new Some("one");
        Some two = new Some("two");
        Some three = new Some("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pw = 555555;

        Password password = new Password(pw);
        password.storePassword();
        password.letMeIn(34);
        password.letMeIn(2);
        password.letMeIn(23);
        password.letMeIn(555555);

        System.out.println("==================================");
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is "+ SIBTest.owner);

    }
}
