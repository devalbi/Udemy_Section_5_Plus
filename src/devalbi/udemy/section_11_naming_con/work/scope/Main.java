package devalbi.udemy.section_11_naming_con.work.scope;


public class Main {

    public static void main(String[] args) {

        String privateVar = "This is private to Main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeCheck privateVar is = " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);

        scopeCheck.timesTwo();

        //Initiate Inner Class
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        //System.out.println("Inner class 'privateVar' is not accessible here " + innerClass.privateVar);

        innerClass.timesTwo();


    }
}
