package com.choongang;
import java.util.*;

public class D_computeCountOfFemaleMember {
    public long computeCountOfFemaleMember(List<Member> members){
        // TODO:
        //list 는 <> 제네릭 타입으로 우리가만든 멤버가 들어오고 있다.

    return     members.stream()
                .filter(member -> member.getGender()=="Female")
                .count();   //long 타입으로 반환
//member 은 리스트의 요소 정의하는 것 Member의 요소 객체



    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

    }
}
