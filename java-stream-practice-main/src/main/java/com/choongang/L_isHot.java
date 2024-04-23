package com.choongang;
import java.util.*;

public class L_isHot {
    public boolean isHot(int[] temperature) {
        // TODO:
        //배열내의 숫자는 온도 그 중 30이상 인 닐 넘기기
        //남은 요소의 개수가 3개 이상인경우 true 아님 false

        long hotDays =   Arrays.stream(temperature)
                .filter(temp->temp >= 30 )
                .count();
//        return hotDays >= 3? true : false;
        return hotDays  >=3;
    }
}
