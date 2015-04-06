import java.util.Arrays;

public class MyStringBuffer {
    private int count;
    private char[] value;

    public MyStringBuffer() {
        count = 0;                  
    }

    public MyStringBuffer(int cap) {
        value = new char[cap];
        count = 0;
    }

    public void add(String s) {
        if (s.length + count > value.length) {
            allocateCap();
        }
        for (int i = 0; i < s.length(); i++) {
            value[count] = s.charAt(i);
        }
    }
        
    public String toString() {
        return String(value, 0, count - 1)
    }

    public allocateCap() {
        newCap = value.length * 2;
        if (newCap < 0) {
            newCap = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value, newCap);
    }
}    

