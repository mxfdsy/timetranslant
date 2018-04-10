/**
 * 需求：编写一个程序，要求用户输入24小时制的时间，然后显示12小时制的时间且加上AM,PM
 * 如12:34表示12点34分。当小时或分钟数小于10时，均没有前导的零，如5:6表示5点零6分。
 * Created by 没想法的岁月 on 2018/4/10.
 */
public class TimeCase {
    public static void main(String[] args) {
        changeTime("11:59");
    }

    private static void changeTime(String s) {
        if (cheak(s)) {
            String[] split = s.split(":");
            int a = Integer.parseInt(split[0]);
            if (a >= 12 && a != 24) {
                int newa = a - 12;
                String newStr = String.valueOf(newa) + ":" + split[1] + " PM";
                System.out.println(newStr);
            } else if (a == 24) {
                System.out.println("00" + ":" + split[1] + " AM");
            } else {
                System.out.println(split[0] + ":" + split[1] + " AM");
            }
        } else {
            System.out.println("请输入正确的24小时格式,例如 12:34表示12点34分");
        }
    }

    private static boolean cheak(String s) {
         String regex ="^[0-2][0-9]:[0-5][0-9]$";
//         String regex ="^\\d{2}:\\d{2}$";
        return s.matches(regex);
//        return  true;
    }
}
