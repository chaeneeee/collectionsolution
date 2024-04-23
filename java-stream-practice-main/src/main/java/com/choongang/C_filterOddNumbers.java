package com.choongang;
import java.util.*;
import java.util.stream.*;

public class C_filterOddNumbers {
    public List<Integer> filterOddNumbers(List<Integer> list) {
        // TODO:


//        return     list.stream()
//                .mapToInt(num -> num )
//                .filter( num -> num %2 ==0)
//                      .boxed() // IntStream을 Stream<Integer>로 변환
//                .collect(Collectors.toList());

           return
                   list.stream()
                .filter( num -> num %2 ==0)
                .collect(Collectors.toList());
            //아무것도 없는 스트림을 반환하면 빈 스트림을 반환하므로
        //빈 리스트가 반환된다


    }
}
