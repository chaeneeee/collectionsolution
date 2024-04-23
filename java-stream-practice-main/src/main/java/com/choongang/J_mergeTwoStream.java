package com.choongang;
import java.util.*;
import java.util.stream.*;

public class J_mergeTwoStream {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        // TODO:
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

//        Stream<String> concatStream= Stream.concat(stream1,stream2);
//        return concatStream.collect(Collectors.toList());

        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }
}
