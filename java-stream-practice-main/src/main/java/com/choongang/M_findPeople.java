package com.choongang;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;
import java.util.stream.*;

public class M_findPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        // TODO:
        //리스트를 합쳐야한다. 첫번째로 concat
        //중복제거하구 ,앞글자 필터링하고 , 정렬하고 리턴
       Stream <String> maleStream = male.stream();
       Stream <String> femaleStream = female.stream();

   Stream<String> people = Stream.concat(maleStream,femaleStream);

        return     people.distinct()
               .filter(person -> person.startsWith(lastName))
               .sorted()
               .collect(Collectors.toList());

    }
}
