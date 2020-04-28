package devalbi.udemy.section_11_naming_con.work.scope;

public class ScopeCheck {

    //Narrowest scope var is used (Most local).
    //Java checks code block for reference to var declaration, if does not find it, Checks next enclosing block.
    //Keeps checking until finds var declaration

    //Class variables
    private int publicVar = 0;
    private int privateVar = 0;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        //Creating a new var with same name,
        // local to method, not available outside of method
        int privateVar = 2;
        for(int i = 0; i < 10; i++){
            System.out.println(i + " times two is " + i * privateVar);
            //this.privateVar to use class variable and override local.
        }
    }

    //Can access inner class from outer class
    //Must initiate inner class
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("privateVar from Inner class is " + innerClass.privateVar);
    }

    //Class Scope for inner class
    public class InnerClass {
        //if no inner class privateVar variable, will check outer class
        //To specify out class Var, use Outerclass.this.var (ScopeCheck.this.privateVar)

        private int privateVar = 3;
        public InnerClass() {
            System.out.println("InnerClass created, privateVar = " + privateVar);
        }

        //associated with new inner class, not outer class
        public void timesTwo(){
            for(int i = 0; i < 10; i++){
                System.out.println(i + " times two is " + i * privateVar);
                //System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
                //ScopeCheck.this.timesTwo() to call outer class method.
            }
        }
    }


}
