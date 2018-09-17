package scopeCheck;

public class Main {
    public static void main(String[] args){
        String privateVar = "this is private to main()";
        Scope scopeInstance = new Scope();
        System.out.println("scopeInstance privateVar is "+ scopeInstance.getPrivateVar());
        System.out.println(privateVar);
    }
}
