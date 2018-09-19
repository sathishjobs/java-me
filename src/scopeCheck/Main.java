package scopeCheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        String privateVar = "this is private to main()";
//        Scope scopeInstance = new Scope();
//        System.out.println("scopeInstance privateVar is "+ scopeInstance.getPrivateVar());
//        System.out.println(privateVar);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        ScopeChallange x = new ScopeChallange(scanner.nextInt());
        x.x();
    }
}
