package com.wibaek.week7;

import java.util.Iterator;
import java.util.Vector;

public class Lab07_3 {
    public static void main(String[] args) {
        // 정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<Integer>();

        v.add(5); // 5 삽입
        v.add(4); // 4 삽입
        v.add(-1); // -1 삽입

        // 벡터 중간에 삽입하기
        v.add(2, 100); // 4와-1 사이에 정수 100 삽입

        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());

        // 모든 요소 정수 출력하기
        Iterator<Integer> it = v.iterator();

        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

        // 벡터 속의 모든 정수 더하기
        it = v.iterator();
        int sum = 0;
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.println("sum: " + sum);
    }
}
