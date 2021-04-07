package devalbi.udemy.section_12_collections.challenge.sets;

public class Main {
    public static void main(String[] args) {

        System.out.println(aHashCode("Test", BodyType.MOON));
        System.out.println(aHashCode("Test", BodyType.MOON));
        System.out.println(aHashCode("Test1", BodyType.MOON));
        System.out.println(aHashCode("Test", BodyType.STAR));
    }

    public static int aHashCode(String name, BodyType bodyType) {
        int hashcode = name.hashCode() + 57;
        hashcode += hashcode + bodyType.hashCode() + 57;
        return hashcode;
    }
}
