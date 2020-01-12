package devalbi.udemy.section_9_abstraction.work.interfaces;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRining;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Deskphone is always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRining){
            System.out.println("Answering the deskphone");
            isRining = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber ==  myNumber){
            isRining = true;
            System.out.println("Ringing");
        } else{
            isRining = false;
        }
        return isRining;
    }

    @Override
    public boolean isRinging() {
        return isRining;
    }
}
