package com.choongang;
import java.util.*;

public class B_computeAverageOfNumbers {
    public double computeAverageOfNumbers(List<Integer> list) {
        // TODO: 평균값 구하기
        if (list.isEmpty() == true) {
            return 0.0;}
        else return list.stream()
                        .mapToInt(num -> num)
                //mapTODouble 도 가능
                        .average()
                //옵셔녈 더블은
                //데이터 + null 값도 들어갈 수 있음
                .orElse(0.0);
//                        .getAsDouble()


        //메서드 스트림 열고 ,. . . 쭉 나갈 때
        //. 단위로 하나씩 띄어서 적는게 좋다
            }
        }





