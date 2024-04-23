package com.choongang;
import java.util.*;

public class G_filterName {
    public String[] filterName(List<String> names) {
        // TODO:
       return  names.stream()
                .filter(name->name.startsWith("김"))
               .distinct()
               .sorted()
               .toArray(String[]::new);
    }
}

//.startsWith 이건 자바 11 이후에 나았다
//더 오래된 것일 경우 안되거나 호환안된다.