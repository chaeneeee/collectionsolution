package com.choongang;
import java.util.*;

public class H_findBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        // TODO:

        if (arr.length==0){
            return null;
        }
       return Arrays.stream(arr)
                .max()
               .getAsInt();




    }
}
