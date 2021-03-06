public class MyString implements Comparable<MyString>{
    private final char [] cArray;

    public MyString(char [] cArray)
    { // defensive copy
        this.cArray = new char[cArray.length];
        System.arraycopy(cArray,0,this.cArray,0, cArray.length);
    }
    @Override
    public int compareTo(MyString that) {
        return this.cArray[0] - that.cArray[0];
    }

    public int size() {
        return cArray.length;
    }

    public char getChar(int i) {
        if (i<0 || i >= size())
            throw new RuntimeException("More details here TODO");

        return cArray[i];
    }
}
