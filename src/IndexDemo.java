/**
 * Created by student on 21.10.2018.
 */
public class IndexDemo {
    public static void main(String[] args) {
        System.out.println("Hello".concat("World"));
        System.out.println("Hello".replace('l', 'w'));
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());

        int i = Integer.parseInt("kitty123".replaceAll("[\\D]", ""));
        int j = Integer.parseInt("123kitty".replaceAll("[\\D]", ""));
        int k = Integer.parseInt("3k2gj5fg".replaceAll("[\\D]", ""));
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        String s = "001234-cat";
        String l = s.replaceFirst("^0*", "");
        System.out.println(l);

        StringBuffer sb = new StringBuffer("Hellol");

        System.out.println("buffer = " + sb);
        System.out.println("lenght = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

    }
}