public class MyInteger implements Comparable<MyInteger> {

    private final int value;
    public MyInteger(int x)
    {
        value = x;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public int compareTo(MyInteger that) {
        return this.value - that.value;
    }
}
