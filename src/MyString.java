public class MyString implements Comparable<MyString>{
    private final char [] cArray;

    public MyString(char [] cArray)
    { // defensive copy
        this.cArray = new char[cArray.length];
        System.arraycopy(cArray,0,this.cArray,0, cArray.length);
    }
    @Override
    public int compareTo(MyString o) {
        return 0;
    }
}
