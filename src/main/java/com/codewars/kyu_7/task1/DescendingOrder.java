package com.codewars.kyu_7.task1;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int number = num;
        if (num == 0) {
            return 0;
        } else {
            while (number > 0) {
                int digit = number % 10;
                list.add(digit);
                number /= 10;
            }
            Collections.sort(list, Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
            return Integer.parseInt(sb.toString());
        }
    }

}
