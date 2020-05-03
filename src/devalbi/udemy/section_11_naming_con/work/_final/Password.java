package devalbi.udemy.section_11_naming_con.work._final;

public class Password {

    //Example why to prevent a method being overridden
    //Absolutely not a example how to encrypt passwords.
    //Use existing crypting library

    private static final int key = 1234567;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome in");
            return true;
        } else {
            System.out.println("Password is incorrect");
            return false;
        }
    }
}
