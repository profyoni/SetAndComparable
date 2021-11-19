import java.util.Comparator;

public class GematriaComparator implements Comparator<MyString> {
    @Override
    public int compare(MyString o1, MyString o2) {
        int g1 = gematria(o1);
        int g2 = gematria(o2);

        return -(g1-g2);
    }

    private int gematria(MyString s) {
        int total = 0;
        for (int i =0; i < s.size() ; i++)
            total += s.getChar(i) - 'A' + 1;

        return total;
    }
}
