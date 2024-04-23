package com.choongang;
import java.util.*;

public class F_makeUniqueNameArray {
    public String[] makeUniqueNameArray(List<String> names) {
        // TODO:
         return   names.stream()
                  .distinct() //중복제거
                 .sorted() //정렬 따로 해서 맞추기
                .toArray(String[]::new);
//            어느타입으로 바꾸든
//
         //array 는 객체다
        //원스타입빼고 다 객체임
         //어떤 타입이 들어오는지


        //lsit > stream
        //중벅재거
        //정렬 오름차순
        //배열로 변환
        //리턴
    }}

