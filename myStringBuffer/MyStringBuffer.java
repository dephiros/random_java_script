import java.lang.System;

public class MyStringBuffer {
    private int count;
    private char[] value;
    private final int defaultCap = 10;

    public MyStringBuffer() {
        count = 0;
        value = new char[defaultCap];                  
    }

    public MyStringBuffer(int cap) {
        value = new char[cap];
        count = 0;
    }

    public void add(String s) {
        if (s.length() + count > value.length) {
            allocateCap();
        }
        for (int i = 0; i < s.length(); i++) {
            value[count] = s.charAt(i);
            count += 1;
        }
    }
        
    public String toString() {
        return new String(value, 0, count);
    }

    public void allocateCap() {
        int newCap = value.length * 2;
        if (newCap < 0) { // if new cap overflows then set max integer
            newCap = Integer.MAX_VALUE;
        }
        char[] old_value = value;
        value = new char[newCap];
        System.arraycopy(old_value, 0, value, 0, count);
    }

    public int getCap() {
        return value.length;
    }
}    

