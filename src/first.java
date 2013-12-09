import java.util.Calendar;
import java.util.Date;

class Duck {
    int size;
    static int duckCount = 0;

    public Duck() {
        duckCount++;
        this.size = 2;
    }

    public Duck(int s) {
        duckCount++;
        this.size = s;
    }
}

public class first {

    public static void main(String[] args) {
        System.out.println(Duck.duckCount);
        Duck d = new Duck();
        System.out.println(Duck.duckCount);
        int d2 = (int) (Math.random()*10);
        System.out.println(d2);
        double dd = 23.6;
        String str = "s" + dd;
        String str1 = Double.toString(dd);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(String.format("исправить %tc",new Date()));
        Calendar c = Calendar.getInstance();
        System.out.println(str);
    }
}

