package day03;

import java.util.Calendar;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int year = Integer.parseInt(str.substring(0,4));
        int month = Integer.parseInt(str.substring(5,7));
        int date = Integer.parseInt(str.substring(8,10));
        int a = s.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DATE,date);
        cal.add(Calendar.DATE,a);
        cal.add(Calendar.DATE,-14);
        cal.set(Calendar.DATE,3);
    }
}
