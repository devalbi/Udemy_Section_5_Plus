package devalbi.udemy.section_11_naming_con.challenge.access_modifier;


/*Challenge
 * In the following interface declaration, what is the availability of the following:
 *
 * 1. The Accessible interface - default/package-private. in classes + sub-classes of same package
 * 2. the int variable SOME_CONSTANT - public, All interface variables are 'public static final'
 * 3. methodA - public, all methods in an interface are public by default
 * 4. methodB and methodC - default/package-private. in classes + sub-classes of same package
 * */

/*
* Default for interface is package-private
* All methods and variables are public
* */

interface Accessible {

    int SOME_CONSTANT = 100; // public, All interface variables are 'public static final'
    public void methodA(); // this is redundant as class accessor overrides it
    void methodB();
    boolean methodC();

}
