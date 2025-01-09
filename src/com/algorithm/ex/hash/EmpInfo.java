package com.algorithm.ex.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class EmpInfo {
    private String name;
    private int empNum;

    // 생성자
    public EmpInfo(String name, int empNum) {
        this.name = name;
        this.empNum = empNum;
    }

    // equals 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                // 같은 객체인 경우 true
        if (o == null || getClass() != o.getClass()) return false; // 클래스 비교
        EmpInfo emp = (EmpInfo) o;               // 타입 캐스팅
        return empNum == emp.empNum && Objects.equals(name, emp.name);
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return Objects.hash(name, empNum);           // name과 age를 기반으로 해시코드 생성
    }

    // toString (출력용)
    @Override
    public String toString() {
        return "EmpInfo{name='" + name + "', empNum=" + empNum + "}";
    }

    public static void main(String[] args) {
        EmpInfo p1 = new EmpInfo("Alice", 30);
        EmpInfo p2 = new EmpInfo("Alice", 30);
        EmpInfo p3 = new EmpInfo("Bob", 25);

        // equals 사용 예제
        System.out.println(p1.equals(p2)); // true (내용이 같으므로)
        System.out.println(p1.equals(p3)); // false (내용이 다르므로)

        // HashSet 사용 예제
        HashSet<EmpInfo> set = new HashSet<>();
        set.add(p1);
        set.add(p2);  // p1과 p2는 동일하므로 중복으로 저장되지 않음
        set.add(p3);

        System.out.println(set); // [Person{name='Alice', age=30}, Person{name='Bob', age=25}]

        // HashMap 사용 예제
        HashMap<EmpInfo, String> map = new HashMap<>();
        map.put(p1, "Developer");
        map.put(p2, "Manager");  // p1과 p2는 동일하므로 덮어쓰기
        map.put(p3, "Designer");

        System.out.println(map); // {Person{name='Alice', age=30}=Manager, Person{name='Bob', age=25}=Designer}
    }

}
