package devalbi.udemy.section_9_abstraction.work.interfaces;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRining;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile is powering on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now Ringing " + phoneNumber + " on Mobile");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRining){
            System.out.println("Answering the Mobile");
            isRining = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber ==  myNumber && isOn){
            isRining = true;
            System.out.println("Ringing");
        } else{
            System.out.println("Mobile is not on or number different.");
            isRining = false;
        }
        return isRining;
    }

    @Override
    public boolean isRinging() {
        return isRining;
    }
}
