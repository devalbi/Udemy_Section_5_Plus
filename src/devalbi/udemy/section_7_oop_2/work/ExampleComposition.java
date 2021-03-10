/*
package devalbi.udemy.section_7_oop_2.work;
public class ExampleClassA {
    private String example;

    public ExampleClassA(String example) { this.example = example; }
    public String getExample() {return example; }
}
public class ExampleClassB{
    private ExampleClassA exampleClassA;

    public String getClassAMethod(){
        exampleClassA.getExample();
    }

    public ExampleClassB(ExampleClassA exampleClassA) { this.exampleClassA = exampleClassA; }
    public ExampleClassA getExampleClassA() { return exampleClassA; }
}
public class Main{
    public static void Main(String[] args) {
        ExampleClassB exampleClassB = new ExampleClassB(new ExampleClassA("Example")); //Can instanciate class in method call.
        ExampleClassA exampleClassA = new ExampleClassA("Example");
        ExampleClassB exampleClassB1 = new ExampleClassB(exampleClassA);

       exampleClassB.getClassAMethod();  //Used to get ExampleA's methods.
    }}*/
