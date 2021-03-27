package day03;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int year = Integer.parseInt(str.substring(0,4));
        int month = Integer.parseInt(str.substring(5,7));
        int date = Integer.parseInt(str.substring(8,10));

        Calendar cal = Calendar.getInstance();
        int a = (365*(cal.get(Calendar.YEAR)-year)-30*month+30*(cal.get(Calendar.MONTH)+1)-date+cal.get(Calendar.DATE))/7;
        System.out.println(a);
    }
}
