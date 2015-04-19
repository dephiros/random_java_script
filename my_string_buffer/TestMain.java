public class TestMain {
    public static void main(String[] args) {
        MyStringBuffer a  = new MyStringBuffer();
        int cap = a.getCap();
        for (int i = 1; i < 100; i++) {
            a.add(Integer.toString(i));
            if (a.getCap() > cap) {
                System.out.printf("current cap: %d\n", a.getCap()); 
                cap = a.getCap();
            }
        }
        String finalString = a.toString();
        System.out.printf("Final string: %s %d\n", finalString, finalString.length());
    }
}
