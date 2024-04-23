package com.choongang;
import java.util.*;

public class I_findLongestLength {
    public int findLongestLength(String[] strArr) {
        // TODO:
        //문자열 여러개 요소로 있음
        //여기서 가장 긴 문지열의 길이를 반환
        //스트림을 만들어
        //가장 길이가 길다? max 사용하면 될텐데
        //스트림의 요소가 숫자이겠군
        //문자열ㅇ르 순회하면서 각 요소를 문자열의 길이로 바꾼후
        //max() 사용해서 가장 큰수를 반환하면 된다.

        return      Arrays.stream(strArr)
//          .mapToInt(str->str.length())
              .mapToInt(String::length)
                .max()
                .orElse(0);

    }
}
