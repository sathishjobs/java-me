package finalTest;

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }

    // you can not override the storepassword bz it is declared final in parrent(Password) class
//    @Override
//    public void storePassword(){
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }

}
