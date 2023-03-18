import java.util.Vector;

public class Example {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<Integer>();
        num.add(12);
        num.add(3);
        num.add(23);

        System.out.println(num);
        System.out.println("After : " + num.set(2,17));
        System.out.println(num);
    }
}
