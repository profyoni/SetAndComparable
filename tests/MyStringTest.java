import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    @Test
    void sortbyGematria() {
        ArrayList<MyString> list = new ArrayList<>();
        list.add(new MyString("DAD".toCharArray()));
        list.add(new MyString("B".toCharArray()));
        list.add(new MyString("aAAAA".toCharArray()));

        Collections.sort(list, new GematriaComparator());

        assertEquals('B', list.get(0).getChar(0));


        Collections.sort(list);
        assertEquals('B', list.get(0).getChar(0));

    }
}