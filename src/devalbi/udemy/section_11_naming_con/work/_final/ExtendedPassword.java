package devalbi.udemy.section_11_naming_con.work._final;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    //Password's method is final, so cannot be overridden
/*    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }*/


}
