package com.choongang;
import java.util.*;

public class A_computeSumOfAllElements {
    public int computeSumOfAllElements(List<Integer> list) {
        // TODO:
        return list.stream()
                .mapToInt(number -> number)
                .sum();
            //아무것도 없으면 알아서 0으로 반환


    }
}
