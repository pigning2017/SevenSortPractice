package demo;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Designed By PIGning
 *
 * @author:PIGning
 * @date:2019/9/21 20:12
 * @description:demo Idea_SevenSort
 */

public class demo {

    public static void main(String[] args) {
        System.out.println(theFormat(0));
        Map map = new HashMap();
        Set set = new HashSet<>();
        List list = new ArrayList<>();


    }

    public static String theFormat(int num) {
        String[] format = {"0","1","2","3","4","5","6","7","8","9","`","!","@","#","$","%","^","&","*","(",")","{","}","\\","<",">","?"};
        StringBuffer res = new StringBuffer();
        if (num >= 0) {
            while (num / 27 > 0) {
                res.insert(0, format[num % 27]);
                num /= 27;
            }
            res.insert(0, format[num % 27]);
        }else {
            num *= -1;
            while (num / 27 > 0) {
                res.insert(0, format[num % 27]);
                num /= 27;
            }
            res.insert(0, format[num % 27]);
            res.insert(0, "-");
        }
        return res.toString();
    }






}
