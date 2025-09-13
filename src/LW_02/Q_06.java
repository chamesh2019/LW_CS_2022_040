package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_06 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf1.format(now));
    }
}
