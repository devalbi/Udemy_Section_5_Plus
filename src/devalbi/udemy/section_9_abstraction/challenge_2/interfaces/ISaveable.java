package devalbi.udemy.section_9_abstraction.challenge_2.interfaces;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> stringList);

}
