package devalbi.udemy.section_9_abstraction.work.interfaces;

public interface ITelephone {

    /*Do not need access modifiers so can remove
*   These are called the signatures
*   Return type, name, parameters    */
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
