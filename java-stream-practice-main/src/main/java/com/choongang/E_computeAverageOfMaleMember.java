package com.choongang;
import java.nio.channels.MembershipKey;
import java.util.*;

public class E_computeAverageOfMaleMember {
    public double computeAverageOfMaleMember(List<Member> members) {
        // TODO:
                    //이름 짓기 어려우면 el element 쓰기

         return     members.stream()
                .filter(member -> member.getGender() == "Male")
                .mapToDouble(Member::getAge)
                .average()
                 // .getAsDouble(); getAsDouble 더블로 가져오는 것
                 .orElse(0); // 옵셔녈은 다 orElse 필수
//                 .getAsDouble();



            //mapToInt -> IntStream 으로 만들어주는 것

}


    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
