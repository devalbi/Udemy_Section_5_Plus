package devalbi.udemy.section_9_abstraction.challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    void read(List<String> savedValues);
    List<String> write();
}
