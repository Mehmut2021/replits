package replit06_Methods;

public class test {

    public static void main(String[] args) {
        String str = "";
        String s = "2:55:22PM";
        //int a = s.charAt(0) - '0';
        //System.out.println(a + 2);
        if (s.charAt(1) == ':') {
            str = "0" + s;
        }

        System.out.println(str);
    }

}
